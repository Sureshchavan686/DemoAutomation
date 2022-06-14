package com.trial;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Features {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--incognito");
		opt.addArguments("headless");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		Dimension dimension = new Dimension(600,600);
		
		
		driver.manage().window().setSize(dimension);
		//driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement txt_name = driver.findElement(By.name("name"));
		driver.findElement(with(By.tagName("label")).below(txt_name));
		
		txt_name.sendKeys("Suresh");
		WebElement chk_iceCream = driver.findElement(By.id("exampleCheck1"));
		driver.findElement(with(By.tagName("label")).above(chk_iceCream)).sendKeys("6656");;
		
		
		//driver.quit();

	}

}
