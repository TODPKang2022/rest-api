package com.example.restapi.controller;

import com.example.restapi.model.UserRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j //logback
@RestController
@RequestMapping("/api/v1")
public class ResponseApiController {
    @PostMapping("")
    public ResponseEntity<UserRequest> user(
//            @RequestBody UserRequest userRequest
    ){
//        System.out.println(userRequest);
        var user = new UserRequest();
        user.setUserName("홍길동");
        user.setUserAge(40);
        user.setCategory("yaho");

        log.info("user : {}", user);

        var response = ResponseEntity
                .status(HttpStatus.CREATED)
                .header("x-custom","hi")
                .body(user);

        return response;
    }
}
