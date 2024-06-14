package com.example.desafio_todo_list.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.desafio_todo_list.entity.ToDo;
import com.example.desafio_todo_list.repository.ToDoRepository;

@Service
public class ToDoService {
  
  private ToDoRepository toDoRepository;
  
  public ToDoService(ToDoRepository toDoRepository) {
    this.toDoRepository = toDoRepository;
  }

  public List<ToDo> create(ToDo toDo){
    toDoRepository.save(toDo);
    return list();

  }

  public List<ToDo> list(){
    //ordenar alfabetica
    Sort sort = Sort.by("prioridade").descending().and(
      Sort.by("nome").ascending()
    );
   return toDoRepository.findAll(sort);

  }

  public List<ToDo> update(ToDo toDo){
    toDoRepository.save(toDo);
    return list();

  }

  public List<ToDo> delete(Long id){
    toDoRepository.deleteById(id);
    return list();
  }
}
