package com.actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.ProjectName.generic.BaseClass;

public class TaskModule extends BaseClass{
	@Test
	public void testCreateTask() {
		Reporter.log("CreateTask",true);
	}
	@Test
	public void testDeleteTask() {
		Reporter.log("DeleteTask",true);
	}
}
