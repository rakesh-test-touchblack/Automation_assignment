package com.OrangeHrm;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement txt_username;
	
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement txt_password;
	

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement btn_login;
	
	
	//methods 
	public void setusername(String user)
	{
		txt_username.sendKeys(user);
	}

	public void setpassword(String pwd)
	{
		txt_password.sendKeys(pwd);
	}
	
	public void clicklogin()
	{
		btn_login.click();
	}

	
	
	
	
}
