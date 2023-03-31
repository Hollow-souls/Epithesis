package edu.wbu.controller;

import edu.wbu.pojo.ResultVO;
import edu.wbu.pojo.Student;
import edu.wbu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author yogs
 * @create 2023-03-2023/3/24-17:01
 */

@RestController
@CrossOrigin
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @PostMapping("/addStudent")
    public ResultVO addStudent(Student student){
        ResultVO resultVO=studentService.addStudent(student);
        return resultVO;
    }

    @GetMapping("/selectAllStudent")
    public ResultVO selectAllStudent(){
        ResultVO resultVO=studentService.listAllStudent();
        return resultVO;
    }

    @PostMapping("/updatePwd")
    public ResultVO updatePwd(String stuId,String stuPwd){
        ResultVO resultVO=studentService.updatePwd(stuId,stuPwd);
        return resultVO;
    }
}
