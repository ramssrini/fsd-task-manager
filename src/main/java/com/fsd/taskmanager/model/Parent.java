/*
 * Copyright (C) 2019, Liberty Mutual Group
 *
 * Created on Apr 1, 2019
 */

package com.fsd.taskmanager.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * @author n0172808
 *
 */
@Entity
@Table(name="parent")
public class Parent{

	@Id
	@GeneratedValue
	@Column(name="parent_id")
	private Long parentId;
	@Column(name="parent_task_desc")
	private String parentTask;
	
	@OneToMany(mappedBy="parent", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JsonManagedReference  // Needed for two serialized object mapping entities to break out of infinite JSON recurrence
	private List<Task> tasks;
	
	/**
	 * @return the parentId
	 */
	public Long getParentId() {
		return parentId;
	}
	/**
	 * @param parentId the parentId to set
	 */
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	/**
	 * @return the parentTask
	 */
	public String getParentTask() {
		return parentTask;
	}
	/**
	 * @param parentTask the parentTask to set
	 */
	public void setParentTask(String parentTask) {
		this.parentTask = parentTask;
	}
	/**
	 * @return the tasks
	 */
	public List<Task> getTasks() {
		return tasks;
	}
	/**
	 * @param tasks the tasks to set
	 */
	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	
	
	
}
