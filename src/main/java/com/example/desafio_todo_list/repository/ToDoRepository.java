package com.example.desafio_todo_list.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.desafio_todo_list.entity.ToDo;
//long é tipo da ID
public interface ToDoRepository extends JpaRepository<ToDo, Long> {
  
}
