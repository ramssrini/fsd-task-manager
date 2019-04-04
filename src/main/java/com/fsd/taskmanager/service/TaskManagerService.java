/*
 * Copyright (C) 2019, Liberty Mutual Group
 *
 * Created on Apr 3, 2019
 */

package com.fsd.taskmanager.service;

import java.util.List;

import com.fsd.taskmanager.model.Task;

/**
 * @author n0172808
 *
 */
public interface TaskManagerService {

	/**
	 * 
	 */
	List<Task> findAllTasks();

}
