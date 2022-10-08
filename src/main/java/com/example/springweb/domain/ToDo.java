package com.example.springweb.domain;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Entity(name = "ToDo")
@Table(name = "todo")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ToDo {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String todo;

}
