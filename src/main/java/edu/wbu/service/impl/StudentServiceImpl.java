package edu.wbu.service.impl;

import ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import edu.wbu.dao.StudentDao;
import edu.wbu.pojo.ResultVO;
import edu.wbu.pojo.Student;
import edu.wbu.service.StudentService;
import edu.wbu.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yog
 * @create 2023-03-2023/3/24-16:58
 */

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public ResultVO addStudent(Student student) {
        student.setStuPwd(MD5Utils.md5(student.getStuPwd()));
        int i=studentDao.insertStudent(student);
        ResultVO resultVO=null;
        if (i > 0) {
            resultVO = new ResultVO(10000, "学生信息添加成功", null);
        }else {
            resultVO =new ResultVO(10001,"学生信息添加失败",null);
        }
        return resultVO;
    }

    @Override
    public ResultVO listAllStudent() {
        List<Student> students=studentDao.selectAll();
        ResultVO resultVO=new ResultVO(10000,"查询教师列表成功",students);
        return resultVO;
    }

    @Override
    public ResultVO updatePwd(String stuId, String stuPwd) {
        stuPwd=MD5Utils.md5(stuPwd);
        int i=studentDao.updatePwd(stuId,stuPwd);
        ResultVO resultVO=null;
        if(i>0){
            resultVO=new ResultVO(10000,"修改密码成功",null);
        }else{
            resultVO=new ResultVO(10001,"修改密码失败",null);
        }
        return resultVO;
    }


}
