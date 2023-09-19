package com.example.restapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // 메소드 자동으로 만들어줌
@AllArgsConstructor // 전체 파라미터 들어가 있음
@NoArgsConstructor // 기본 생성자들 포함
public class BookRequest {
    private String name;

    private String number;

    private String category;
}
