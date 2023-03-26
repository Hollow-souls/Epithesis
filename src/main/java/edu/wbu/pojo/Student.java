package edu.wbu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author yog
 * @create 2023-03-2023/3/22-15:17
 */

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String stuId;
    private String stuPwd;
    private String stuName;
    private String stuGender;
    private String stuClass;
    private String stuAdviser;
    private String stuInternship;
    private String stuFaculty;

}
