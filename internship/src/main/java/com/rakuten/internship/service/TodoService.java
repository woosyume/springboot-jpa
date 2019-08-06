package com.rakuten.internship.service;

import java.util.List;
import java.util.Optional;

import com.rakuten.internship.entity.Todo;
import com.rakuten.internship.repository.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TodoService {

    @Autowired
    private TodoRepository repository;

    public Optional<Todo> findProduct(Long id){
        return repository.findById(id);
    }

    public List<Todo> findProducts(){
        return repository.findAll();
    }

    public Todo save(Todo todo) {
        return repository.save(todo);
    }
}