package edu.wbu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @author yog
 * @create 2023-03-2023/3/25-17:30
 */

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Notice {
    private String mgrId;
    private Date noticeDate;
    private String noticeContent;

}
