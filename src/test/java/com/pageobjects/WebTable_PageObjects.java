package com.pageobjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.constants.BaseLibrary;

import de.erichseifert.vectorgraphics2d.Document;

public class WebTable_PageObjects extends BaseLibrary {

	@FindBy(xpath = "//a[@class='next_link']")
	public static WebElement btn_nextPage;
	
	@FindBy(xpath = "(//tbody[@id='myTable']//tr//td)[last()]")
	public static WebElement tr_lastRow;
	
	@FindBy(xpath = "(//tbody[@id='myTable']//tr//td)[last()-2]")
	public static WebElement tr_last2ndRow;
	
	@FindBy(xpath = "//input[@id='task-table-filter']")
	public static WebElement txt_searchBox;
	
	@FindBy(xpath = "//table[@id='task-table']//tbody//tr//td[contains(text(),'Jane')]")
	public static WebElement tr_seearchData;
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	public static WebElement txt_uname;
	
	
	@FindBy(xpath = "//button[@class='btn btn-default btn-xs btn-filter']")
	public static WebElement btn_filter;
	
	public void table_pagination()
	{
		while(btn_nextPage.isDisplayed())
		{
			btn_nextPage.click();
			waitTill("3");
			
		}
		waitTill("5");
		System.out.println(tr_lastRow.getText());
	}
	
	public void table_search()
	{
		txt_searchBox.sendKeys("Jane");
		waitTill("3");
		String dat =tr_seearchData.getText();
		System.out.println(dat);
	}
	
	public void table_filter(String uname)
	{
		waitTill("3");
		btn_filter.click();
		waitTill("3");
		txt_uname.click();
		waitTill("3");
		txt_searchBox.sendKeys(uname);
		Actions actions = new Actions(driver);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("document.getElementById(txt_searchBox).value=uname");
		//js.executeScript("alert('Success')", null)
		
		actions.contextClick(txt_searchBox).build();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
}
