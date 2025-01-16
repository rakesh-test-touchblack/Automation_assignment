package com.OrangeHrm;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Launchquit {
	WebDriver driver;
	
	@BeforeMethod
	@Parameters("browser")
	void setup(@Optional("chrome") String nameofbrowser)
	{
		if(nameofbrowser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		if(nameofbrowser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		if(nameofbrowser.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	}
	
	
	
	@AfterMethod 
	public void quit()
	{
		driver.quit();
	}

}
