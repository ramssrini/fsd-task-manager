/*
 * Copyright (C) 2019, Liberty Mutual Group
 *
 * Created on Apr 4, 2019
 */

package com.fsd.taskmanager.model;

import com.fasterxml.jackson.databind.util.StdConverter;

/**
 * @author n0172808
 *
 */
public class ParentToStringConverter extends StdConverter<Parent, String> {

	/* (non-Javadoc)
	 * @see com.fasterxml.jackson.databind.util.StdConverter#convert(java.lang.Object)
	 */
	@Override
	public String convert(Parent parent) {
		
		return " { \"parentId\":"+parent.getParentId()+",  \"parentTask\":"+ parent.getParentTask() +"  }";
	}
	
	

}
