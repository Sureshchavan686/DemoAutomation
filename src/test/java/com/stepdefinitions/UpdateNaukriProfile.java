package com.stepdefinitions;

import java.awt.AWTException;

import org.openqa.selenium.support.PageFactory;

import com.constants.DriverManager;
import com.pageobjects.NaukriProfile_PageObjects;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UpdateNaukriProfile extends DriverManager{

	NaukriProfile_PageObjects no = new NaukriProfile_PageObjects();
	
	@When("User is on Naukri Site")
	public void user_is_on_Naukri_Site() {
		
		no = PageFactory.initElements(driver, NaukriProfile_PageObjects.class);
		
		
		
	}

	@Then("User enters Username {string} password {string}")
	public void user_enters_Username_password(String uname, String password)
	{
		no.loginToNaukri(uname, password);
	}

	@Then("User updates profile by making changes")
	public void user_updates_profile_by_making_changes() throws AWTException  {
		
		no.updateProfile();
		no.uploadResumeFile();
		no.logOut();
	}
}
