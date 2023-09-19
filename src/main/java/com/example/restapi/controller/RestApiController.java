package com.example.restapi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping(path="/hello")
    public String hello(){
        return "Hello Spring Boot";
    }

    @GetMapping(path = "/echo/{message}")
    public String echo(
            // 문자 변경 해야 되는 경우 아래 name = 활용
            @PathVariable(name = "message") String msg
    ){
        System.out.println("echo message : " + msg);

        return msg;
    }

}
