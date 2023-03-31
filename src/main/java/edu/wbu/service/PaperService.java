package edu.wbu.service;

import edu.wbu.pojo.ResultVO;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * @author yog
 * @create 2023-03-2023/3/27-16:20
 */
public interface PaperService {
    public ResultVO updatePaper(String stuId, MultipartFile stuPaper);

    public ResultVO selectPaper(String stuId);
}
