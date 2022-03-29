package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.constants.BaseLibrary;

public class FileUpload_PageObject extends BaseLibrary{
	
	@FindBy(xpath = "//input[@type='file']")
	public static WebElement btn_fileUpload;
	
	@FindBy(xpath = "//button[@id='btn2']")
	public static WebElement btn_Register;
	
	@FindBy(xpath = "//multi-select//div[@class='ui-autocomplete-multiselect-item' and contains(text(),'Arabic')]")
	public static WebElement sel_arabic;
	
	@FindBy(xpath = "//div[@id='msdd']")
	public static WebElement dd_language;
	
	public void uploadFile() throws InterruptedException
	{
		click(btn_Register);
		Thread.sleep(3000);
		click(dd_language);
		Thread.sleep(3000);
		
		
	}
	
	public void upload()
	{
		click(sel_arabic);
		click(btn_fileUpload);
	}

}
