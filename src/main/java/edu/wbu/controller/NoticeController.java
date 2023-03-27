package edu.wbu.controller;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import edu.wbu.pojo.ResultVO;
import edu.wbu.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author yog
 * @create 2023-03-2023/3/26-15:33
 */

@RestController
@CrossOrigin
@RequestMapping("/notice")
public class NoticeController {
    @Autowired
    private NoticeService noticeService;

    @GetMapping("/selectAllNotice")
    public ResultVO selectAllNotice(){
        ResultVO resultVO=noticeService.listAllNotice();
        return resultVO;
    }

    @PostMapping("/addNotice")
    public ResultVO addNotice(String mgrId, Date noticeDate,String noticeContent){
        ResultVO resultVO=noticeService.addNotice(mgrId,noticeDate,noticeContent);
        return resultVO;
    }
}
