package edu.wbu.service;

import edu.wbu.pojo.ResultVO;

import java.util.Date;

/**
 * @author yog
 * @create 2023-03-2023/3/27-11:10
 */
public interface SchedulingService {
    public ResultVO upDateTime(String task, Date taskBegin,Date taskEnd);
}
