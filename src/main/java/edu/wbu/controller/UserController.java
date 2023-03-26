package edu.wbu.controller;

import edu.wbu.pojo.ResultVO;
import edu.wbu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yog
 * @create 2023-03-2023/3/22-16:05
 */

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResultVO login(String username,String loginPwd,String role){
        ResultVO resultVO = userService.checkLogin(username, loginPwd, role);
        return  resultVO;
    }
}
