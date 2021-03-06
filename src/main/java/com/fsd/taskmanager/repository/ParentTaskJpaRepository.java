/*
 * Copyright (C) 2019, Liberty Mutual Group
 *
 * Created on Apr 2, 2019
 */

package com.fsd.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsd.taskmanager.model.Parent;

/**
 * @author n0172808
 *
 */
public interface ParentTaskJpaRepository extends JpaRepository<Parent, Long> {

}
