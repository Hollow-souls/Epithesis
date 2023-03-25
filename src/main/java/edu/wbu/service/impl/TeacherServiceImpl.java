package edu.wbu.service.impl;

import edu.wbu.dao.TeacherDao;
import edu.wbu.pojo.ResultVO;
import edu.wbu.pojo.Teacher;
import edu.wbu.service.TeacherService;
import edu.wbu.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shkstart
 * @create 2023-03-2023/3/24-11:20
 */

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherDao teacherDao;

    @Override
    public ResultVO addTeacher(Teacher teacher) {
        teacher.setTeacherPwd(MD5Utils.md5(teacher.getTeacherPwd()));
        int i=teacherDao.insertTeacher(teacher);
        ResultVO resultVO=null;
        if (i > 0) {
            resultVO = new ResultVO(10000, "教师信息添加成功", null);
        }else {
            resultVO =new ResultVO(10001,"教师信息添加失败",null);
        }
        return resultVO;
    }

    @Override
    public ResultVO listAllTeacher() {
        List<Teacher> teachers=teacherDao.selectAll();
        ResultVO resultVO=new ResultVO(10000,"查询教师列表成功",teachers);
        return resultVO;
    }
}
