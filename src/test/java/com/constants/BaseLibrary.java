package com.constants;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

}
