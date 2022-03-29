package com.stepdefinitions;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.constants.AutomationConstants;
import com.constants.DriverManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends DriverManager{
	
	public static WebDriver driver;
	
	@Before()
	public void setup() throws IOException {
		
		
		
		driver = getDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/");
		
	
	}
	
	@After()
	public void tearDown(Scenario scenario) throws IOException
	{
		if(scenario.isFailed())
		{
			TakesScreenshot scr = ((TakesScreenshot)driver);
			File scrFile = scr.getScreenshotAs(OutputType.FILE);
			DateTimeFormatter timeStampPattern = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm:ss a");
			LocalDateTime localDateTime = LocalDateTime.now();	
			String locaDate = timeStampPattern.format(localDateTime);
			//File destFile = new File("src//test//resources//Screenshots//failed_"+locaDate+ ".png");
			FileUtils.copyFile(scrFile, new File(".//Screenshots//" + locaDate + ".png"));
			driver.quit();
			
		}
		
		else
		driver.quit();
	}
	
	/*
	 * DateTimeFormatter FOMATTER =
	 * DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mm a");
	 * 
	 * String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new
	 * Date()); FileUtils.copyFile(scrFile, new File( "E:\\Edureka\\signup.png"
	 		+ fileName + " " + timestamp + ".png"));*/
}
