package edu.wbu.service;

import edu.wbu.pojo.ResultVO;
import edu.wbu.pojo.Student;
import edu.wbu.pojo.Teacher;

/**
 * @author yog
 * @create 2023-03-2023/3/24-16:57
 */
public interface StudentService {
    public ResultVO addStudent(Student student);

    public ResultVO listAllStudent();
}
