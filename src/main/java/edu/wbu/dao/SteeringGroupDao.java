package edu.wbu.dao;

import org.apache.ibatis.annotations.Param;

/**
 * @author yog
 * @create 2023-03-2023/3/31-10:16
 */
public interface SteeringGroupDao {
    public int insertSteeringGroup(@Param("teacherId") String teacherId, @Param("stuId") String stuId);
}
