package edu.wbu.dao;

import edu.wbu.pojo.Notice;

import java.util.List;

/**
 * @author yog
 * @create 2023-03-2023/3/25-18:52
 */
public interface NoticeDao {
    public List<Notice> selectAll();
}
