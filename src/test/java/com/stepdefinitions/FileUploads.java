package com.stepdefinitions;

import org.openqa.selenium.support.PageFactory;

import com.constants.DriverManager;
import com.pageobjects.FileUpload_PageObject;
import com.pageobjects.RegisterUser_PageObject;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FileUploads extends DriverManager {
	
	FileUpload_PageObject fl = new FileUpload_PageObject();
	
	@When("User is on Automation Demo Site with valid info")
	public void user_is_on_Automation_Demo_Site_with_valid_info() throws InterruptedException 
	{
		fl = PageFactory.initElements(driver, FileUpload_PageObject.class);
		fl.uploadFile();
	}

	@Then("User should upload file in Demo site")
	public void user_should_upload_file_in_Demo_site() 
	{
		
		fl.upload();
	}

}
