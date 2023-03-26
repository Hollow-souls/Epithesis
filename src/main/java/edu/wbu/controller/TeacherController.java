package edu.wbu.controller;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import edu.wbu.pojo.ResultVO;
import edu.wbu.pojo.Teacher;
import edu.wbu.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author yog
 * @create 2023-03-2023/3/24-11:26
 */

@RestController
@CrossOrigin
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @PostMapping("/addTeacher")
    public ResultVO addTeacher(Teacher teacher){
        ResultVO resultVO=teacherService.addTeacher(teacher);
        return resultVO;
    }

    @GetMapping("/selectAllTeacher")
    public ResultVO selectAllTeacher(){
        ResultVO resultVO=teacherService.listAllTeacher();
        return resultVO;
    }
}
