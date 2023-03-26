package edu.wbu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yog
 * @create 2023-03-2023/3/22-15:32
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultVO<T> {
    private int code;
    private String msg;
    private T data;
}
