package edu.wbu.controller;

import edu.wbu.pojo.ResultVO;
import edu.wbu.pojo.Student;
import edu.wbu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart
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
}