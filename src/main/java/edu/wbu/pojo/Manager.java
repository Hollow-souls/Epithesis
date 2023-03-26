package edu.wbu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author yog
 * @create 2023-03-2023/3/22-15:19
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Manager {
    private String mgrId;
    private String mgrPwd;
    private String mgrName;
    private String mgrGender;
    private String mgrAge;
    private String mgrTel;
}
