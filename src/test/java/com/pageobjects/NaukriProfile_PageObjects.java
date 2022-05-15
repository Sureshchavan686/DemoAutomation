package com.pageobjects;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.constants.BaseLibrary;

public class NaukriProfile_PageObjects extends BaseLibrary{

	@FindBy(xpath = "//li[@class='Login']//div[@class='mTxt']")
	public static WebElement btn_login;
	
	@FindBy(xpath = "//input[@placeholder='Enter your active Email ID / Username']")
	public static WebElement txt_username;
	
	@FindBy(xpath = "//input[@placeholder='Enter your password']")
	public static WebElement txt_pass;
	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement btn_submit;
	
	@FindBy(xpath = "//div[@class='user-name roboto-bold-text']")
	public static WebElement lbl_profileName;
	
	@FindBy(xpath = "(//div[@class='widgetHead'])[1]//span[2]")
	public static WebElement btn_editResumeHeader;
	
	@FindBy(xpath = "//div[@class='input-field s12']//textarea")
	public static WebElement txt_resumeHeader;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	public static WebElement btn_save;
	
	@FindBy(xpath = "//div[@class='mTxt' and contains(text(),'My Naukri')]")
	public static WebElement lbl_myNaukri;
	
	@FindBy(xpath = "//li//a[@title='Logout']")
	public static WebElement btn_logout;
	
	
	
	public void loginToNaukri(String uname,String pass)
	{
		click(btn_login);
		waitTill("3");
		sendValue(uname, txt_username);
		sendValue(pass, txt_pass);
		click(btn_submit);
		
	}
	
	public void updateProfile() 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		click(lbl_profileName);
		waitTill("3");
		click(btn_editResumeHeader);
		click(txt_resumeHeader);
		sendValue("\b", txt_resumeHeader);
		click(btn_save);
		waitTill("5");
		click(btn_editResumeHeader);
		click(txt_resumeHeader);
		waitTill("7");
		sendValue("2", txt_resumeHeader);
		click(btn_save);
		
		
	}
	
	public void logOut()
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(lbl_myNaukri);
		click(btn_logout);
		
	}
}
