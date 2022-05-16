package com.stepdefinitions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

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
		driver.get("https://www.naukri.com/");
		
	
	}
	
	@After()
	public void tearDown(Scenario scenario) throws IOException, InterruptedException
	{
		if(scenario.isFailed())
		{
			TakesScreenshot scr = ((TakesScreenshot)driver);
			File scrFile = scr.getScreenshotAs(OutputType.FILE);
			String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			File destFile = new File(System.getProperty("user.dir") + "/Screenshots/" + "New Screenshot " + dateName + ".png");
			FileUtils.copyFile(scrFile, destFile);
			
			Thread.sleep(3);
			driver.quit();
		}
		
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
