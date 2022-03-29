package com.trial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoFrames {
	
	public WebDriver driver;
	
	@BeforeTest
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

	}
	
	@AfterTest
	public void tearDown()
	{
		//driver.quit();
		
	}
	
	@Test
	public void automateFrame() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Frames')]")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='ad_position_box']//iframe[@id ='ad_iframe']")));
		driver.findElement(By.xpath("//div[@id='dismiss-button']")).click();
		System.out.println("Test passed");
	}

}
