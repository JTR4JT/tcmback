package com.jt.tool;

import lombok.Data;

/**
 * @author BXO
 * @version 1.0
 * @description: TODO
 * @date 2023/3/26 23:08
 */
@Data
public class ResultType<T> {
    public Integer code;
    public T data;
}
