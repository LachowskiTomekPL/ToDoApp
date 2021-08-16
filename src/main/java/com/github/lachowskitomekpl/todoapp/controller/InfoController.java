package com.github.lachowskitomekpl.todoapp.controller;

import com.github.lachowskitomekpl.todoapp.TaskConfigurationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class InfoController {


    private DataSourceProperties dataSource;
    private TaskConfigurationProperties properties;

    public InfoController(DataSourceProperties dataSource, TaskConfigurationProperties properties) {
        this.dataSource = dataSource;
        this.properties = properties;
    }

    @GetMapping("/info/url")
    String url() {
        return dataSource.getUrl();
    }

    @GetMapping("/info/properties")
    boolean myProperties() {
        return properties.isAllowMultipleTasksFromTemplate();
    }
}
