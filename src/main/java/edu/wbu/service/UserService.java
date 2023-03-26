package edu.wbu.service;

import edu.wbu.pojo.ResultVO;

/**
 * @author yog
 * @create 2023-03-2023/3/22-15:51
 */
public interface UserService {
    public ResultVO checkLogin(String username, String loginPwd, String role);
}
