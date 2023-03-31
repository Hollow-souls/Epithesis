package edu.wbu.dao;

import edu.wbu.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author yog
 * @create 2023-03-2023/3/22-15:44
 */
public interface StudentDao {
    public Student selectById(String stuId);

    public int insertStudent(Student student);

    public List<Student> selectAll();

    public int updatePwd(@Param("stuId") String stuId,@Param("stuPwd") String stuPwd);

    public int updateAdviser(@Param("stuId") String stuId,@Param("stuAdviser") String stuAdviser);
}
