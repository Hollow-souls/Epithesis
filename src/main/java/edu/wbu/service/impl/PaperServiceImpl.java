package edu.wbu.service.impl;

import ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy;
import com.mysql.cj.util.DnsSrv;
import edu.wbu.dao.PaperDao;
import edu.wbu.pojo.Paper;
import edu.wbu.pojo.ResultVO;
import edu.wbu.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * @author yog
 * @create 2023-03-2023/3/27-16:21
 */
@Service
public class PaperServiceImpl implements PaperService {
    @Autowired
    private PaperDao paperDao;

    @Override
    public ResultVO updatePaper(String stuId, MultipartFile stuPaper) {
      ResultVO resultVO=null;
        if(stuPaper.isEmpty()){
          return resultVO=new ResultVO(4,"文件为空",null);
      }
        String originalFilename=stuPaper.getOriginalFilename();
        String fileName=System.currentTimeMillis()+"."+originalFilename.substring(originalFilename.lastIndexOf(".")+1);
        String filePath="E:\\大四\\毕设\\Epithesis\\word\\";
        File dest=new File(filePath+fileName);
        if(dest.getParentFile().exists()){
            dest.getParentFile().mkdir();
        }
        try {
            stuPaper.transferTo(dest);
        }catch (Exception e){
            e.printStackTrace();
            return resultVO=new ResultVO(5,"文件上传失败",null);
        }
        Paper paper= paperDao.selectStu(stuId);
        if("".equals(paper)){
            int i=paperDao.insertPaper(stuId,filePath+fileName);
        }else {
            int i=paperDao.updatePaper(stuId,filePath+fileName);
        }

        return resultVO=new ResultVO(10000,"文件上传成功",null);
    }

    public ResultVO selectPaper(String stuId){
        String paper =paperDao.selectPaper(stuId);
        ResultVO resultVO=null;
        if(paper.isEmpty()){
            resultVO=new ResultVO(10001,"文件不存在",null);
        }else{
            resultVO=new ResultVO(10000,"查询成功",paper);
        }
        return resultVO;
    }
}
