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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
            return new ResultVO(1002,"登录成功",null);
        }else{
            return new ResultVO(1003,"密码错误",null);
        }
    }
}
