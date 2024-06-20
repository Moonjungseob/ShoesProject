package com.busanit501.shoesproject.domain.mjsdomain;

import jakarta.persistence.*;
import lombok.*;

// 댓글이 사용되는 방식이 주로 게시물의 번호를 통해서 사용되는 경우가 많아서,
// 게시글 당 댓글의 수나, 해당 게시글의 댓글 목록등
// 쿼리 조건으로 자주 사용되는 컬럼에 인덱스 생성하기.
@Entity
@Getter
@Setter
@Builder
@Table(name = "reply", indexes = {
        @Index(name = "idx_reply_shoes_item_id", columnList = "shoes_item_id")
})
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Reply extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rno;

    // 외래키 설정. 마치 디비에서 설정하는 것과 비슷.
    //FetchType.LAZY , 영속성 컨텍스트 = 1차 캐시 테이블,
    // 실제 테이블 과 동기화 놀이.
    // 실제 테이블에 반영하는 정책을 모아서 반영한다.
    @ManyToOne(fetch = FetchType.LAZY)
    private Shoes shoes;

    private String replyText;

    private String replyer;

    // 댓글 내용만 교체 하기.
    public void chageText(String text) {
        this.replyText = text;
    }

}
