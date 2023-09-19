package com.example.restapi.controller;

import com.example.restapi.model.QueryParam;
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

    // http://localhost:38080/api/query-param?category=IT&issuedYear=2023&issued-month=01&issued_day=31
    @GetMapping(path = "/query-param")
    public void queryParam(
            @RequestParam String category,
            @RequestParam String issuedYear,
            //JAVA에서는 변수명에 하이픈 안됨.
            @RequestParam(name = "issued-month") String issuedMonth,
            //snake convention 은 가능은 하지만 비추
            @RequestParam String issued_day

    ){
        System.out.println(category);
        System.out.println(issuedYear);
        System.out.println(issuedMonth);
        System.out.println(issued_day);

    }


    @GetMapping(path = "/query-param2")
    public void queryParam2(
            // 아무런 어노테이션 안붙이고 객체를 바로 받음
            QueryParam bookQueryParam

    ){
        System.out.println(bookQueryParam);

    }

}
