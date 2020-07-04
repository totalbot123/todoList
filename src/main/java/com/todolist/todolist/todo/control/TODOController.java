package com.todolist.todolist.todo.control;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.todolist.todolist.todo.model.TODOItem;

@RestController
@RequestMapping("/todo")
public class TODOController {

	@Autowired
	private TODOService todoService;

	@RequestMapping(method = RequestMethod.GET, path = "/{tabId}")
	public List<TODOItem> getTODOList(@PathVariable int tabId) {
		return todoService.getTODOList(tabId);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public List<TODOItem> addTODOItem(@RequestBody Map<String, String> todoItem) {
		String todoItemQuest = todoItem.get("quest");
		int tabId = Integer.parseInt(todoItem.get("tabId"));
		todoService.addTODOItem(todoItemQuest, tabId);
		return todoService.getTODOList(tabId);
	}
	
	@RequestMapping(method = RequestMethod.PUT, path = "/{todoItemId}")
	public List<TODOItem> editTODOItem(@PathVariable int todoItemId, @RequestBody Map<String, String> todoItem) {
		String modifiedQuest = todoItem.get("quest");
		int tabId = Integer.parseInt(todoItem.get("tabId"));
		todoService.editTODOItem(todoItemId, modifiedQuest);
		return todoService.getTODOList(tabId);
	}

	@RequestMapping(method = RequestMethod.DELETE, path = "/{todoItemId}")
	public void deleteTODOItem(@PathVariable int todoItemId) {
		todoService.deleteTODOItem(todoItemId);
	}

}
