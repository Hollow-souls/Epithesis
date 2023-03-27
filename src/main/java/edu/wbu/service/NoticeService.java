package edu.wbu.service;

import edu.wbu.pojo.Notice;
import edu.wbu.pojo.ResultVO;

import java.util.Date;
import java.util.List;

/**
 * @author yog
 * @create 2023-03-2023/3/26-15:29
 */
public interface NoticeService {
    public ResultVO listAllNotice();

    public ResultVO addNotice(String mgrId, Date noticeDate,String noticeContent);
}
