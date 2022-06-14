package com.trial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.id("resultTable"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", table);
		
		List<WebElement> tr = driver.findElements(By.xpath("//table[@id='resultTable']//parent::tbody/tr"));
		int tr_size = tr.size();
		
		//List<WebElement> td = driver.findElements(By.xpath("//table[@id='resultTable']//parent::tbody/tr//following-sibling::td"));
		//table[@id='resultTable']//parent::tbody/tr
		
		
		for(int i=0;i<tr_size;i++)
		{
			List<WebElement> td = tr.get(i).findElements(By.xpath("//table[@id='resultTable']//parent::tbody/tr//following-sibling::td[last()-1]"));
			
			int td_count = td.size();
			
			for(int j=0;j<td_count;j++)
			{
				String CellText= td.get(j).getText();
				System.out.println(CellText+ "");
			}
			System.out.println("");
		}
		driver.quit();
		
	}

}
