package com.back.boundedContext.post.domain;


import com.back.shared.member.domain.ReplicaMember;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Entity
@Table(name="POST_MEMBER")
@NoArgsConstructor
public class PostMember extends ReplicaMember {
    public PostMember(int id, LocalDateTime createDate, LocalDateTime modifyDate, String username, String password, String nickname){
        //부모 영역의 필드를 초기화시켜주는 것
        super(id, createDate, modifyDate, username, password, nickname);
    }

}
