package edu.wbu.controller;

import edu.wbu.pojo.ResultVO;
import edu.wbu.service.SchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author yog
 * @create 2023-03-2023/3/27-11:58
 */

@RestController
@CrossOrigin
@RequestMapping("/task")
public class SchedulingController {
    @Autowired
    private SchedulingService schedulingService;

    @PostMapping("/updateTask")
    public ResultVO updateTime(String task, Date taskBegin,Date taskEnd){
        ResultVO resultVO = schedulingService.upDateTime(task, taskBegin, taskEnd);
        return resultVO;
    }

}
