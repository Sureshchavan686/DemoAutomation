package com.constants;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import com.pageobjects.RegisterUser_PageObject;

public class DriverManager {

	public static WebDriver driver;
	public static RegisterUser_PageObject rpage;

	public static String browser;

	public static WebDriver getDriver() throws IOException {

		try {
			BufferedReader fr = new BufferedReader(new FileReader(AutomationConstants.PropertiesFile));
			Properties prop = new Properties();
			prop.load(fr);
			String browserDriver = prop.getProperty("browser");
			switch (browserDriver) {

			case "chrome":
				if(driver==null)
				System.setProperty("webdriver.chrome.driver", AutomationConstants.ChromeDriver);
				driver = new ChromeDriver();
				break;

			case "firefox":
				if(driver==null)
				System.setProperty("webdriver.gecko.driver", AutomationConstants.FirefoxDriver);
				driver = new FirefoxDriver();
				break;

			case "internetexplorer":
				if(driver==null)
				System.setProperty("webdriver.internetexplorer.driver", AutomationConstants.IEDriver);
				driver = new InternetExplorerDriver();
				break;

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
		finally 
		
		{
			//rpage= PageFactory.initElements(driver, RegisterUser_PageObject.class);

		}
		return driver;
	}

}
