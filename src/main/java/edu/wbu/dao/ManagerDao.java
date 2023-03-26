package edu.wbu.dao;

import edu.wbu.pojo.Manager;

/**
 * @author yog
 * @create 2023-03-2023/3/22-15:22
 */
public interface ManagerDao {
    public Manager selectById(String mgrId);
}
