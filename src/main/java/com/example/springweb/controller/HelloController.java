package com.example.springweb.controller;

import com.example.springweb.service.ToDoService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
@RequiredArgsConstructor
public class HelloController {

    private final ToDoService toDoService;

    @GetMapping("/hello")
    public String hello() throws IOException {
        return "hello";
    }

    @GetMapping("/add")
    public String add() throws Exception{
        toDoService.addToDo();
        return "add";
    }

}
