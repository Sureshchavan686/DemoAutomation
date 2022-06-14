package com.stepdefinitions;

import org.openqa.selenium.support.PageFactory;

import com.constants.DriverManager;
import com.pageobjects.WebTable_PageObjects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HandlingWebTable extends DriverManager{

	WebTable_PageObjects wb = new WebTable_PageObjects();
	
		
	@Given("User is on Selenium Easy Automation Demo Site")
	public void User_is_on_Selenium_Easy_Automation_Demo_Site()
	{
		wb = PageFactory.initElements(driver,WebTable_PageObjects.class);

		System.out.println("Hi I am insie webTable");
		//wb.table_pagination();
		//wb.table_search();
	}
	
	
	@Then("User performs some actions on webtable with {string} and")
	public void user_performs_some_actions_on_webtable_with_and(String uname) {
		
		wb.table_filter(uname);
		
	}
}
