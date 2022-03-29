package com.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.constants.DriverManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.pageobjects.RegisterUser_PageObject;

public class RegisterUser extends DriverManager{
	
	
	RegisterUser_PageObject reg = new RegisterUser_PageObject();
	
	@When("User is on Automation Demo Site")
	public void user_is_on_Automation_Demo_Site() {
		reg = PageFactory.initElements(driver, RegisterUser_PageObject.class);
		reg.open_register_form();
		
	}

	@Then("User enters Firstname {string} Last Name {string} and Adress {string}")
	public void user_enters_Firstname_Last_Name_and_Adress(String fname, String lname, String address) {
		reg.enter_user_details1(fname, lname, address);
	}

	@Then("User enters Email {string} Phone {string} and Hobbies")
	public void user_enters_Email_Phone_and_Gender_and_Hobbies(String email, String phone) {
		
		reg.enter_user_details2(email, phone);
	}

	


}
