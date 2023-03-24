package edu.wbu.service.impl;

import edu.wbu.dao.StudentDao;
import edu.wbu.pojo.ResultVO;
import edu.wbu.pojo.Student;
import edu.wbu.service.StudentService;
import edu.wbu.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shkstart
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
}
