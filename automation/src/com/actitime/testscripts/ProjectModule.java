package com.actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.ProjectName.generic.BaseClass;

public class ProjectModule extends BaseClass{
@Test
public void testCreateProject() {
	Reporter.log("CreateProject",true);
}
@Test
public void testDeleteProject() {
	Reporter.log("DeleteProject",true);
}
}
