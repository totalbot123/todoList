package com.todolist.todolist.todo.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.todolist.todolist.todo.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	
	public Optional<User> findByUsername(String username);
	
}
