package com.stepdefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.support.PageFactory;

import com.constants.DriverManager;
import com.pageobjects.RegisterUser_PageObject;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
		
		/** Switch between Windows
		String par = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		
		Iterator<String> itr = child.iterator();
		
		while(itr.hasNext())
		{
			String childString = itr.next();
			String titleString =driver.getTitle();
			if(!par.equalsIgnoreCase(childString) && titleString=="wewe")
			{
				driver.switchTo().window(childString);
			}
		}**/
	}

	


}
