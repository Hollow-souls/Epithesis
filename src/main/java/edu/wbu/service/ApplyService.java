package edu.wbu.service;

import edu.wbu.pojo.ResultVO;

/**
 * @author yog
 * @create 2023-03-2023/3/31-10:24
 */
public interface ApplyService {
    public ResultVO insertApply(String teacherId,String stuId);

    public ResultVO listAllApply(String teacherId);
}
