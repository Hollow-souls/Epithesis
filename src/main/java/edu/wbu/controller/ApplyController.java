package edu.wbu.controller;

import edu.wbu.pojo.ResultVO;
import edu.wbu.service.ApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yog
 * @create 2023-03-2023/3/31-10:28
 */
@RestController
@CrossOrigin
@RequestMapping("/apply")
public class ApplyController {
    @Autowired
    private ApplyService applyService;

    @PostMapping("/addApply")
    public ResultVO addApply(String teacherId,String stuId){
        ResultVO resultVO=applyService.insertApply(teacherId,stuId);
        return resultVO;
    }

    @PostMapping("/selectAllApply")
    public ResultVO selectAllApply(String teacherId){
        ResultVO resultVO=applyService.listAllApply(teacherId);
        return resultVO;
    }
}
