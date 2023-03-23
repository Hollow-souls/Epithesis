package edu.wbu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author shkstart
 * @create 2023-03-2023/3/22-15:10
 */

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private String teacherId;
    private String teacherPwd;
    private String teacherName;
    private String teacherGender;
    private String teacherTel;
    private String teacherFaculty;

}
