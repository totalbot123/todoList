package com.todolist.todolist.todo.control;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todolist.todolist.todo.dao.TODORepository;
import com.todolist.todolist.todo.model.TODOItem;

@Service
public class TODOService {
	
	@Autowired
	private TODORepository todoRepository;

	public List<TODOItem> getTODOList(int tabId) {
		List<TODOItem> TODOList = new ArrayList<>();
		todoRepository.findByTabId(tabId).forEach(TODOList::add);
		return TODOList;
	}

	public void addTODOItem(String todoItemQuest, Integer tabId) {
		todoRepository.save(new TODOItem(todoItemQuest, tabId));
	}
	
	public void editTODOItem(int todoItemId, String modifiedQuest) {
		TODOItem todoItem = todoRepository.findById(todoItemId).orElse(null);
		if (todoItem == null) {
			return;
		}
		todoItem.setQuest(modifiedQuest);
		todoRepository.save(todoItem);
	}

	public void deleteTODOItem(int id) {
		todoRepository.deleteById(id);
	}


}
