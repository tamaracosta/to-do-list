package com.example.desafio_todo_list.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.example.desafio_todo_list.entity.ToDo;
import com.example.desafio_todo_list.service.ToDoService;

import jakarta.validation.Valid;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
@RequestMapping("todos")
public class ToDoController {
  private ToDoService toDoService;

  public ToDoController(ToDoService toDoService){
    this.toDoService = toDoService;
  }
  
  @PostMapping   
  List<ToDo> create(@RequestBody @Valid ToDo toDo){
    return toDoService.create(toDo);
  }

  @GetMapping  
  List<ToDo> list(){
    return toDoService.list();
  }

  @PutMapping 
  List<ToDo> update(@RequestBody ToDo toDo){
    return toDoService.update(toDo);
  }

  @DeleteMapping("{id}")
  List<ToDo> delete(@PathVariable("id") Long id){
    return toDoService.delete(id);
  }
}
