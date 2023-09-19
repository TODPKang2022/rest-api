package com.example.restapi.model;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestParam;

@Data
public class QueryParam {
    private String category;

    private String issuedYear;

    private String issuedMonth;

    private String issued_day;
}
