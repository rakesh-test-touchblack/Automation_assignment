package com.OrangeHrm;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.AfterClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestLogin extends Launchquit {
	
	
	
	

	@Test
	void testlogin()
	{
		LoginPage lp = new LoginPage(driver);
		lp.setusername("Admin");
		lp.setpassword("admin123");
		lp.btn_login.click();
		

		    String actualTitle = driver.getTitle();
		    System.out.println(actualTitle);
		    String expectedTitle = "OrangeHRM"; 
		    Assert.assertEquals(actualTitle, expectedTitle);
	}
		
	

		    
		

	
}
	
	

	

