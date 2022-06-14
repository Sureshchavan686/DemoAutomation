package com.trial;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Upload {

	@Test
	public void uploadFile() throws AWTException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","H://chromedriver.exe");
		WebDriver drv = new ChromeDriver(); // starting Firefox browser
		ChromeDriver drvv = new ChromeDriver();
		ChromeOptions opt = new ChromeOptions();
		
		FirefoxDriver fx = new FirefoxDriver();
	    drv.manage().window().maximize(); // maximizing window
	    drv.get("https://www.grammarly.com/plagiarism-checker");//open testing website
	 
	    JavascriptExecutor js = (JavascriptExecutor)drv; // Scroll operation using Js Executor
	    js.executeScript("window.scrollBy(0,200)"); // Scroll Down(+ve) upto browse option
	    Thread.sleep(2000); // suspending execution for specified time period
	 
	     WebElement browse = drv.findElement(By.xpath("//div[@class='_3255a-uploadButton']"));
	     // using linkText, to click on browse element 
	    browse.click(); // Click on browse option on the webpage
	    Thread.sleep(2000); // suspending execution for specified time period
		
		/*StringSelection strSelection = new StringSelection("C://doc.docx");
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(strSelection, null);
 
        Robot rb = new Robot();
  
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
    
       // release Contol+V for pasting
       rb.keyRelease(KeyEvent.VK_CONTROL);
       rb.keyRelease(KeyEvent.VK_V);
    
       // for pressing and releasing Enter
       rb.keyPress(KeyEvent.VK_ENTER);
       rb.keyRelease(KeyEvent.VK_ENTER);*/
	}
}
