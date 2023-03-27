package edu.wbu.dao;

import org.apache.ibatis.annotations.Param;

import java.util.Date;

/**
 * @author yog
 * @create 2023-03-2023/3/27-10:01
 */
public interface SchedulingDao {
    public int updateTime(@Param("task") String task,@Param("taskBegin") Date taskBegin,@Param("taskEnd") Date taskEnd);
}
