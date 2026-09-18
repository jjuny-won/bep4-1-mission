package com.back.shared.member.domain;

//Shared 에 넣기 애매하면 모듈에 넣고. 의존성이 생기거나 글로벌하게 쓰이면 추후에 빼도 된다.

import com.back.global.jpa.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static lombok.AccessLevel.PROTECTED;

@MappedSuperclass
@Getter
@Setter(value = PROTECTED) //Setter 를 Protected 로 만들어줌->상속받은 클래스 등 제한된 범위에서만 setter를 사용하도록
@NoArgsConstructor
public abstract class BaseMember extends BaseEntity {

    @Column(unique = true)
    private String username;
    private String password;
    private String nickname;
    private int activityScore;

    public BaseMember(String username, String password, String nickname) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
    }
}
