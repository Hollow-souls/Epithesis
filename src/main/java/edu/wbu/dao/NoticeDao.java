package edu.wbu.dao;

import edu.wbu.pojo.Notice;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author yog
 * @create 2023-03-2023/3/25-18:52
 */
public interface NoticeDao {
    public List<Notice> selectAll();

    public int insertNotice(@Param("mgrId") String mgrId,@Param("noticeDate") Date noticeDate,@Param("noticeContent") String noticeContent);

}
