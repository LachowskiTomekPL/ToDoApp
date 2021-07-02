package com.github.lachowskitomekpl.todoapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class InfoController {

    @Autowired
    private DataSourceProperties dataSource;
    @Value("${task.allowMultipleTemplate}")
    private String prop;


    @GetMapping("/info/url")
    String url() {
        return dataSource.getUrl();
    }

    @GetMapping("/info/prop")
    String myProp() {
        return prop;
    }
}
