package edu.wbu.dao;

import edu.wbu.pojo.Teacher;

/**
 * @author shkstart
 * @create 2023-03-2023/3/22-15:39
 */
public interface TeacherDao {
    public Teacher selectById(String teacherId);

    public int insertTeacher(Teacher teacher);
}
