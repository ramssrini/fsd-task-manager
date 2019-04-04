/*
 * Copyright (C) 2019, Liberty Mutual Group
 *
 * Created on Apr 3, 2019
 */

package com.fsd.taskmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fsd.taskmanager.model.Task;
import com.fsd.taskmanager.service.TaskManagerService;

/**
 * @author n0172808
 *
 */
@RestController
@RequestMapping("api/taskManager/")
public class TaskManagerController {

	@Autowired
	private TaskManagerService taskManagerService;
	
	@RequestMapping(value="getTasks", method=RequestMethod.GET)
	public @ResponseBody List<Task> findAllTasks(){
		return taskManagerService.findAllTasks();
	}
	
}
