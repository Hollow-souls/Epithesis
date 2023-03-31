package edu.wbu.service.impl;

import edu.wbu.dao.ManagerDao;
import edu.wbu.dao.StudentDao;
import edu.wbu.dao.TeacherDao;
import edu.wbu.pojo.Manager;
import edu.wbu.pojo.ResultVO;
import edu.wbu.pojo.Student;
import edu.wbu.pojo.Teacher;
import edu.wbu.service.UserService;
import edu.wbu.utils.MD5Utils;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * @author yog
 * @create 2023-03-2023/3/22-15:52
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private ManagerDao managerDao;
    @Autowired
    private TeacherDao teacherDao;
    @Autowired
    private StudentDao studentDao;

    @Override
    public ResultVO checkLogin(String username, String loginPwd, String role) {
        String password=null;
        if("manager".equals(role)){
            Manager manager = managerDao.selectById(username);
            password=manager==null?null:manager.getMgrPwd();
        }else if("teacher".equals(role)){
            Teacher teacher = teacherDao.selectById(username);
            password=teacher==null?null:teacher.getTeacherPwd();
        }else if("student".equals(role)){
            Student student = studentDao.selectById(username);
            password=student==null?null:student.getStuPwd();
        }


        loginPwd=MD5Utils.md5(loginPwd);
        System.out.println(loginPwd);
        if(password==null){
            return new ResultVO(1001,"账户不存在",null);
        }else if(password.equals(loginPwd)){
            JwtBuilder builder = Jwts.builder();
            HashMap<String,Object> map = new HashMap<>();
            map.put("role",role);
            String token = builder.setSubject(username)     //设置subject，就是token中携带的数据
                    .setId(username)           // token的id---可以设置当前用户id
                    .setClaims(map)         // 设置当前用户的角色、权限等信息
                    .setIssuedAt(new Date())                //设置生成时间
                    .setExpiration(new Date( System.currentTimeMillis()+ 24*60*60*1000 )) //设置过期时间
                    .signWith( SignatureAlgorithm.HS256,"yogpop" )    //设置加密方式，和加密的 key
                    .compact();
            System.out.println(token);
            return new ResultVO(10000,"登录成功",token);
        }else{
            return new ResultVO(1003,"密码错误",null);
        }
    }
}
