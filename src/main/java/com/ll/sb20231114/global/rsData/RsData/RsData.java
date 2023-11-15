package com.ll.sb20231114.global.rsData.RsData;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RsData<T> { //Result Data
    private String resultCode;
    private String msg;
    private T data;
}
