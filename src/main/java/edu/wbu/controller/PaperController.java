package edu.wbu.controller;

import edu.wbu.pojo.ResultVO;
import edu.wbu.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * @author yog
 * @create 2023-03-2023/3/27-16:32
 */

@RestController
@CrossOrigin
@RequestMapping("/paper")
public class PaperController {
    @Autowired
    private PaperService paperService;

    @PostMapping("/uploadPaper")
    public ResultVO uploadPaper(String stuId, MultipartFile stuPaper){
        ResultVO resultVO=paperService.updatePaper(stuId,stuPaper);
        return resultVO;
    }

    @GetMapping("/preview")
    public ResultVO previewPaper(String stuId){
        ResultVO resultVO=paperService.selectPaper(stuId);
        return resultVO;
    }

}
