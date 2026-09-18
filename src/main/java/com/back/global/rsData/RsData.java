package com.back.global.rsData;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RsData<T> {

    //결과코드(resultCode), 메시지(msg), 데이터(data)를 한 묶음으로 돌려주는 객체다
    private final String resultCode;
    private final String msg;
    private final T data;

    // Data 안넘어가는 구조
    public RsData(String resultCode, String msg) {
        this(resultCode, msg, null);
    }
}