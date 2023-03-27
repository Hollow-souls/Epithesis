package edu.wbu.service.impl;

import edu.wbu.dao.SchedulingDao;
import edu.wbu.pojo.ResultVO;
import edu.wbu.service.SchedulingService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author yog
 * @create 2023-03-2023/3/27-11:11
 */
@Service
public class SchedulingServiceImpl implements SchedulingService {
    @Autowired
    private SchedulingDao schedulingDao;

    @Override
    public ResultVO upDateTime(String task, Date taskBegin, Date taskEnd) {
        int i=schedulingDao.updateTime(task,taskBegin,taskEnd);
        ResultVO resultVO=null;
        if(i>0){
            resultVO=new ResultVO(10000,"时间更新成功",null);
        }else {
            resultVO=new ResultVO(10001,"时间更新失败",null);
        }
        return resultVO;
    }
}
