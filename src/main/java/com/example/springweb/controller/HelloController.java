package com.example.springweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class HelloController {

    @Autowired
    DataSource dataSource;

    @GetMapping("/hello")
    public String hello() throws IOException {
        return "hello";
    }

}
