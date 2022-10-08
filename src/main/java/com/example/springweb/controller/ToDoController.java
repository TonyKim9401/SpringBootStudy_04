package com.example.springweb.controller;

import com.example.springweb.domain.ToDo;
import com.example.springweb.service.ToDoService;
import com.sun.tools.javac.comp.Todo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/todos")
@RequiredArgsConstructor
public class ToDoController {

    private final ToDoService toDoService;

    @GetMapping("/list")
    public String list(Model model){
        List<ToDo> toDoList = toDoService.getToDoList();
        model.addAttribute("todos",toDoList);
        return "list";
    }

    @PostMapping("/addTodo")
    public String addTodo(@RequestParam("todo") String todo){
        toDoService.addToDo(todo);
        return "redirect:/todos/list";
    }


}
