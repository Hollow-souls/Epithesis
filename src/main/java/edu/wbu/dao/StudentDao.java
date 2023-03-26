package edu.wbu.dao;

import edu.wbu.pojo.Student;

import java.util.List;

/**
 * @author yog
 * @create 2023-03-2023/3/22-15:44
 */
public interface StudentDao {
    public Student selectById(String stuId);

    public int insertStudent(Student student);

    public List<Student> selectAll();
}
