package edu.wbu.controller;

import edu.wbu.pojo.ResultVO;
import edu.wbu.service.SteeringGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yog
 * @create 2023-03-2023/3/31-10:51
 */
@RestController
@CrossOrigin
@RequestMapping("/steeringGroup")
public class SteeringGroupController {
    @Autowired
    private SteeringGroupService steeringGroupService;

        @PostMapping("/accept")
    public ResultVO accept(String teacherId,String stuId){
        ResultVO resultVO=steeringGroupService.accept(teacherId,stuId);
        return resultVO;
    }
}
