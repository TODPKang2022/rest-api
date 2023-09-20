package com.example.restapi.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // 메소드 자동으로 만들어줌
@AllArgsConstructor // 전체 파라미터 들어가 있음
@NoArgsConstructor // 기본 생성자들 포함
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class) //Snake Case -> Camel Case
public class UserRequest {
    private String userName;

    private Integer userAge;

    private String category;
}
