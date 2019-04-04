/*
 * Copyright (C) 2019, Liberty Mutual Group
 *
 * Created on Apr 3, 2019
 */

package com.fsd.taskmanager.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsd.taskmanager.model.Task;
import com.fsd.taskmanager.repository.TaskJpaRepository;

/**
 * @author n0172808
 *
 */
@Service
public class TaskManagerServiceImpl implements TaskManagerService {

	@Autowired
	private TaskJpaRepository taskJpaRepository;
	
//	@Autowired
//	private ParentTaskJpaRepository parentTaskJpaRepository;
	
	/* (non-Javadoc)
	 * @see com.fsd.taskmanager.service.TaskManagerService#findAllTasks()
	 */
	@Override
	public List<Task> findAllTasks() {
		List<Task> tasks = new ArrayList<>();
		tasks = taskJpaRepository.findAll();
		
		for(Task task:tasks){
			System.out.println(task.getTaskId());
			System.out.println(task.getTask());
			System.out.println(task.getParent().getParentId());
			System.out.println(task.getParent().getParentTask());
		}
		
		return tasks;
//		return taskJpaRepository.findAll();
	}

}
