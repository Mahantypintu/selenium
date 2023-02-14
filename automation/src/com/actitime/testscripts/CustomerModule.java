package com.actitime.testscripts;

import org.testng.Reporter;

import org.testng.annotations.Test;

import com.ProjectName.generic.BaseClass;

public class CustomerModule extends BaseClass{
   @Test
   public void testCreateCustomer() {
	   Reporter.log("CreateCustomer",true);
    }
   @Test
   public void testDeleteCustomer() {
	  Reporter.log("DeleteCustomer",true);
    }
   @Test
   public void testRegisterCustomer() {
	  Reporter.log("RegisterCustomer",true);
    }
   @Test
   public void testEditCustomer() {
	  Reporter.log("EditCustomer",true);
    }
}
