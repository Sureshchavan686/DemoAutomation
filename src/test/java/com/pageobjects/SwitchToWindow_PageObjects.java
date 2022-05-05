package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.constants.BaseLibrary;

public class SwitchToWindow_PageObjects extends BaseLibrary{

	@FindBy(xpath = "//a[contains(text(),'SwitchTo')]")
	public static WebElement mnu_SwitchTo;
	
	@FindBy(xpath = "//a[contains(text(),'Alerts')]")
	public static WebElement opt_Alerts;
	
	@FindBy(xpath = "//a[contains(text(),'Windows')]")
	public static WebElement opt_Windows;
	
	@FindBy(xpath = "//a[contains(text(),'Frames')]")
	public static WebElement opt_Frames;
	
	
	
	public void selectMenu()
	{
		mouseHover(mnu_SwitchTo);
		click(opt_Windows);
	}
	
}
