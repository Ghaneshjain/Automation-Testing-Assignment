package com.selenium.training;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Login {
WebDriver driver;
@BeforeSuite(alwaysRun=true)
public void setupSuite()
{
	System.setProperty("webdriver.gecko.driver", "/Users/ghanesh.jain/Downloads/geckodriver");
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
}
	@Test
	public void launch() throws InterruptedException {
		driver.get("https://uat-admin.mybbu.com/user/login");
		driver.findElement(By.id("edit-name")).sendKeys("ghanesh.jain@srijan.net");
		driver.findElement(By.id("edit-pass")).sendKeys("Srijan@123");
		driver.findElement(By.id("edit-submit")).click();
		Thread.sleep(4000);
	}
	@AfterMethod()
	public void teardown() {
		driver.quit();
	}
	
}
	


