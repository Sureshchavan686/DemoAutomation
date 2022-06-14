package com.constants;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseLibrary extends DriverManager {


	public void click(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);

		} catch (Exception e) {
			waitForElement(element);
			element.click();
		}

	}

	public void sendValue(String value, WebElement element) {
		try {
			if (driver != null)
				// waitTill(5);Z
				element.sendKeys(value);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void sendKeyBoardkey(Keys value, WebElement element) {
		try {
			if (driver != null)
				// waitTill(5);Z
				element.sendKeys(value);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void waitTill(String durationInSecond) {
		try {
			long n = (long) Double.parseDouble(durationInSecond);
			Thread.sleep(n * 1000);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}


	public WebElement waitForElement(WebElement element) {

		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.visibilityOf(element));
			element.isDisplayed();

		} catch (Exception e) {

		}
		return element;

	}
	
	public void mouseHover(WebElement element)
	{
		try
		{
			waitForElement(element);
			Actions actions = new Actions(driver);
			actions.moveToElement(element);
			actions.perform();
			
		}
		catch (Exception e) {
			System.out.println("Nothing mouse hover");
		}
		
	}
	
	public void uploadResume() throws AWTException
	{
		StringSelection strSelection = new StringSelection("C:\\Suresh R Chavan 5 Yrs Resume.docx");
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
       rb.keyRelease(KeyEvent.VK_ENTER);
       //rb.delay(3000);
	}

}
