package com.todolist.todolist.todo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.todolist.todolist.todo.model.TODOItem;

@Repository
public interface TODORepository extends CrudRepository<TODOItem, Integer> {
	
	List<TODOItem> findByTabId(Integer tabId);

}
