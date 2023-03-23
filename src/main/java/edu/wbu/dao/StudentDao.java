package edu.wbu.dao;

import edu.wbu.pojo.Student;
import edu.wbu.pojo.Teacher;

/**
 * @author shkstart
 * @create 2023-03-2023/3/22-15:44
 */
public interface StudentDao {
    public Student selectById(String stuId);
}
