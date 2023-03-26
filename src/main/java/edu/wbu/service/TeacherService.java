package edu.wbu.service;

import edu.wbu.pojo.ResultVO;
import edu.wbu.pojo.Teacher;

/**
 * @author yog
 * @create 2023-03-2023/3/24-11:17
 */
public interface TeacherService {
    public ResultVO addTeacher(Teacher teacher);

    public ResultVO listAllTeacher();
}
