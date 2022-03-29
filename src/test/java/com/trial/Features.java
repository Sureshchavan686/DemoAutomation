package com.trial;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Features {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement txt_name = driver.findElement(By.name("name"));
		driver.findElement(with(By.tagName("label")).below(txt_name));
		
		txt_name.sendKeys("Suresh");
		WebElement chk_iceCream = driver.findElement(By.id("exampleCheck1"));
		driver.findElement(with(By.tagName("label")).above(chk_iceCream)).sendKeys("6656");;
		
		
		//driver.quit();

	}

}
