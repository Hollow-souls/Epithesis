package edu.wbu.dao;

import edu.wbu.pojo.Apply;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author yog
 * @create 2023-03-2023/3/31-10:15
 */
public interface ApplyDao {
    public int insertApply(@Param("teacherId") String teacherId,@Param("stuId") String stuId);

    public int deleteApply(String stuId);

    public List<Apply> selectAllApply(@Param("teacherId") String teacherId);
}
