package edu.wbu.dao;

import edu.wbu.pojo.Paper;
import org.apache.ibatis.annotations.Param;

import java.io.File;

/**
 * @author yog
 * @create 2023-03-2023/3/27-16:12
 */
public interface PaperDao {
    public int updatePaper(@Param("sutId") String stuId,@Param("stuPaper") String stuPaper);

    public int insertPaper(@Param("stuId") String stuId,@Param("stuPaper") String stuPaper);

    public String selectPaper(@Param("stuId")String stuId);

    public Paper selectStu(@Param("stuId")String stuId);
}
