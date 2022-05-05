package com.stepdefinitions;

import org.openqa.selenium.support.PageFactory;

import com.constants.DriverManager;
import com.pageobjects.RegisterUser_PageObject;
import com.pageobjects.SwitchToWindow_PageObjects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SwitchToWindow extends DriverManager{

	RegisterUser_PageObject reg = new RegisterUser_PageObject();
	SwitchToWindow_PageObjects sw = new SwitchToWindow_PageObjects();
	
	@Given("User Loggs in demo site")
	public void user_Loggs_in_demo_site() {
		reg = PageFactory.initElements(driver, RegisterUser_PageObject.class);
		reg.open_register_form();
	}

	@When("User Mouse hover on SwitchTo menu")
	public void user_Mouse_hover_on_SwitchTo_menu() {
		sw = PageFactory.initElements(driver, SwitchToWindow_PageObjects.class);
		sw.selectMenu();
	}
}
