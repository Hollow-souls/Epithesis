package edu.wbu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.File;

/**
 * @author yog
 * @create 2023-03-2023/3/27-15:56
 */

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Paper {
    private String stuId;
    private String stuPaper;
}
