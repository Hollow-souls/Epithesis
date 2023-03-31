package edu.wbu.service.impl;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import edu.wbu.dao.ApplyDao;
import edu.wbu.dao.SteeringGroupDao;
import edu.wbu.dao.StudentDao;
import edu.wbu.dao.TeacherDao;
import edu.wbu.pojo.ResultVO;
import edu.wbu.pojo.Teacher;
import edu.wbu.service.SteeringGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yog
 * @create 2023-03-2023/3/31-10:37
 */
@Service
public class SteeringGroupServiceImpl implements SteeringGroupService {
    @Autowired
    private SteeringGroupDao steeringGroupDao;
    @Autowired
    private ApplyDao applyDao;
    @Autowired
    private StudentDao studentDao;
    @Autowired
    private TeacherDao teacherDao;

    @Override
    public ResultVO accept(String teacherId, String stuId) {
        int i=steeringGroupDao.insertSteeringGroup(teacherId,stuId);
        int i2=applyDao.deleteApply(stuId);
        String adviser=teacherDao.selectById(teacherId).getTeacherName();
        int i3=studentDao.updateAdviser(stuId,adviser);
        ResultVO resultVO=new ResultVO(10000,"接受成功",null);
        return resultVO;
    }
}
