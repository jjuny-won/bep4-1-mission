package com.back.global.jpa.entity;


import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter
public class BaseIdAndTimeManual extends BaseEntity{
//    ID 자동 생성과 날짜 Auditing을 제거
    @Id
    private int id;
    private LocalDateTime createDate;
    private LocalDateTime modifyDate;
}
