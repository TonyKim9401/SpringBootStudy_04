package com.example.springweb.service;

import com.example.springweb.domain.ToDo;
import com.example.springweb.repository.ToDoRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class ToDoService {

    private final ToDoRepository toDoRepository;

    @Transactional
    public void addToDo(){
        ToDo toDo = new ToDo();
        toDo.setTodo("hello + " + new Date().toString());
        toDoRepository.save(toDo);
    }
}
