package edu.wbu.service.impl;

import edu.wbu.dao.NoticeDao;
import edu.wbu.pojo.Notice;
import edu.wbu.pojo.ResultVO;
import edu.wbu.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.PrimitiveIterator;

/**
 * @author yog
 * @create 2023-03-2023/3/26-15:30
 */

@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    private NoticeDao noticeDao;

    @Override
    public ResultVO listAllNotice() {
        List<Notice> notices=noticeDao.selectAll();
        ResultVO resultVO=new ResultVO(10000,"查询所有公告成功",notices);
        return resultVO;
    }

    @Override
    public ResultVO addNotice(String mgrId, Date noticeDate, String noticeContent) {
        int i=noticeDao.insertNotice(mgrId,noticeDate,noticeContent);
        ResultVO resultVO=null;
        if(i>0){
            resultVO=new ResultVO(10000,"添加公告成功",null);
        }else {
            resultVO=new ResultVO(10001,"添加公告失败",null);
        }
        return resultVO;
    }
}
