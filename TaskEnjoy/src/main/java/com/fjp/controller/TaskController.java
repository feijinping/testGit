package com.fjp.controller;

import java.util.HashMap;
import java.util.Map;

import com.fjp.service.TaskService;

public class TaskController {
	private TaskService taskService = new TaskService();
	public void addTask() {
		Map<String, String> map = new HashMap<>();
		taskService.addTask(map);
	}
	public void taskComplete() {
		
	}
	public void taskCompleteCancel() {
		
	}
	public void taskEdit() {
		
	}
	public void taskDelete() {
		
	}
}
