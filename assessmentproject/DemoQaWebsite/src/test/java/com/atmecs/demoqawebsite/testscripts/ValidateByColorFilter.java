package com.atmecs.demoqawebsite.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.demoqawebsite.helper.Helper;
import com.atmecs.demoqawebsite.testsuite.TestBase;

public class ValidateByColorFilter extends TestBase 
{
	@Test
	public void NavigateToUrl() 
	{
		//Verifying whether user is navigated to 3rd page 
		  driver.navigate().to("http://shop.demoqa.com/shop");
		  String expectedUrl = "http://shop.demoqa.com/shop/";
		  String actualUrl = "";
		  actualUrl = driver.getCurrentUrl();
		  log.printLog(actualUrl);
		  asert.Assertion(actualUrl, expectedUrl, "Navigated successfully");
		  
		  
		//Verifying whether user is navigated to 3rd page 
		  Helper.clickOnElement("loc.link.thirdpage");
		 // driver.findElement(By.xpath("(//a[@class='page-numbers'])[2]")).click();
		  String expectedTitle = "Products – Page 3 – ToolsQA Demo Site";
		  String actualTitle = "";
		  actualTitle=driver.getTitle();
		  log.printLog(actualTitle);
		  asert.Assertion(actualTitle, expectedTitle, "Navigated successfully");
		  
		  driver.findElement(By.name("filter_color")).sendKeys("yellow");
		  String expectedTitle1 = "Products not available";
		  String actualTitle1 = "";
		  actualTitle=driver.getTitle();
		  log.printLog(actualTitle);
		  asert.Assertion(actualTitle, expectedTitle, "404 error");
		  }
}
	

