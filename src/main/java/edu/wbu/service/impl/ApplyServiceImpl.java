package edu.wbu.service.impl;

import edu.wbu.dao.ApplyDao;
import edu.wbu.pojo.Apply;
import edu.wbu.pojo.ResultVO;
import edu.wbu.service.ApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yog
 * @create 2023-03-2023/3/31-10:25
 */
@Service
public class ApplyServiceImpl implements ApplyService {
    @Autowired
    private ApplyDao applyDao;

    @Override
    public ResultVO insertApply(String teacherId, String stuId) {
        int i=applyDao.insertApply(teacherId,stuId);
        ResultVO resultVO=null;
        if (i > 0) {
            return resultVO=new ResultVO(10000,"申请成功",null);
        }else{
            return resultVO=new ResultVO(10001,"申请失败",null);
        }
    }

    public ResultVO listAllApply(String teacherId){
        List<Apply> list=applyDao.selectAllApply(teacherId);
        ResultVO resultVO=new ResultVO(10000,"查询完成",list);
        return resultVO;
    }
}
