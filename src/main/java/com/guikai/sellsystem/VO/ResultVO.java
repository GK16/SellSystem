package com.guikai.sellsystem.VO;

//http请求返回的最外层对象

import lombok.Data;

@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;

}
