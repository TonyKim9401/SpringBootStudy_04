package com.example.springweb.service;

import com.example.springweb.domain.ToDo;
import com.example.springweb.repository.ToDoRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ToDoService {

    private final ToDoRepository toDoRepository;

    @Transactional(readOnly = true)
    public List<ToDo> getToDoList(){
        return toDoRepository.findAll();
    }

    @Transactional
    public void addToDo(String todo){
        ToDo toDo = new ToDo();
        toDo.setTodo(todo);
        toDoRepository.save(toDo);
    }

}
