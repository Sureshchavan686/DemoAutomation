package com.pageobjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.constants.BaseLibrary;

public class RegisterUser_PageObject extends BaseLibrary {

	@FindBy(xpath = "//button[@id='btn2']")
	public static WebElement btn_Register;

	@FindBy(xpath = "//input[@placeholder='First Name']")
	public static WebElement txt_fname;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	public static WebElement txt_lname;

	@FindBy(xpath = "//textarea")
	public static WebElement txt_address;

	@FindBy(xpath = "//a[contains(text(),'Mobiles')]")
	public static WebElement mnu_App;

	@FindBy(xpath = "//div[@id='eid']//input")
	public static WebElement txt_email;

	@FindBy(xpath = "//input[@type='tel']")
	public static WebElement txt_phone;

	@FindBy(xpath = "//input[@type='radio' and @value='Male']")
	public static WebElement rd_male;

	@FindBy(xpath = "//input[@type='radio' and @value='FeMale']")
	public static WebElement rd_female;

	@FindBy(xpath = "//input[@type='checkbox' and @value='Cricket']")
	public static WebElement chk_hobby1;

	@FindBy(xpath = "//input[@type='checkbox' and @value='Hockey']")
	public static WebElement chk_hobby2;

	@FindBy(xpath = "//li//a[@class='ui-corner-all' and contains(text(),'Arabic')]")
	public static WebElement sel_arabic;

	@FindBy(xpath = "//li//a[@class='ui-corner-all' and contains(text(),'Czech')]")
	public static WebElement sel_czech;

	@FindBy(xpath = "//li//a[@class='ui-corner-all' and contains(text(),'Danish')]")
	public static WebElement sel_danish;

	@FindBy(xpath = "//li//a[@class='ui-corner-all']")
	public static List<WebElement> sel_languge;

	@FindBy(xpath = "(//span[@class='ui-icon ui-icon-close'])[2]")
	public static WebElement del_language;

	@FindBy(xpath = "//select[@id='Skills']")
	public static WebElement dd_skills;

	@FindBy(xpath = "//select[@id='yearbox']")
	public static WebElement cal_years;
	
	@FindBy(xpath = "//select[@placeholder='Month']")
	public static WebElement cal_month;
	
	@FindBy(xpath = "//select[@id='daybox']")
	public static WebElement cal_day;

	@FindBy(xpath = "//div[@id='msdd']")
	public static WebElement dd_language;
	
	@FindBy(xpath = "//button[@id='submitbtn']")
	public static WebElement btn_submit;
	
	

	public void open_register_form() {
		System.out.println("Inside register method");
		click(btn_Register);
	}

	public void enter_user_details1(String fname, String lname, String address) {
		sendValue(fname, txt_fname);
		sendValue(lname, txt_lname);
		sendValue(address, txt_address);
	}

	public void enter_user_details2(String email, String phone) {
		sendValue(email, txt_email);
		sendValue(phone, txt_phone);
		click(rd_female);
		click(chk_hobby1);
		click(chk_hobby2);
		windowScroll();
		click(dd_language);
		waitTill("5");
		click(sel_arabic);
		click(sel_czech);
		click(sel_danish);
		waitTill("5");
		click(del_language);
		selectSkills();
		selectDateofBirth();
		click(btn_submit);

	}

	public void windowScroll() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
	}

	public void selectSkills() {
		Select sel = new Select(dd_skills);
		sel.selectByValue("Android");

	}
	
	public void selectDateofBirth() {
		Select sel_year = new Select(cal_years);
		sel_year.selectByValue("1925");
		
		Select sel_month = new Select(cal_month);
		sel_month.selectByValue("April");
		
		Select sel_day = new Select(cal_day);
		sel_day.selectByValue("6");

	}

}
