package edu.wbu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @author yog
 * @create 2023-03-2023/3/27-9:56
 */

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Scheduling {
    private String task;
    private Date taskBegin;
    private Date taskEnd;


}
