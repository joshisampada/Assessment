package com.atmecs.demoqawebsite.testscripts;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.atmecs.demoqawebsite.constants.ProjectPathConstants;
import com.atmecs.demoqawebsite.helper.ExcelReading;
import com.atmecs.demoqawebsite.helper.Helper;
import com.atmecs.demoqawebsite.testsuite.TestBase;
import com.atmecs.demoqawebsite.utils.PropertiesUtil;



public class ValidateColorAndSortTest extends TestBase
{
	@Test
	public void sorting()
	{
		driver.navigate().to("http://shop.demoqa.com/shop");
		
		driver.findElement(By.name("filter_color")).sendKeys("Yellow");
		Helper.clickOnElement("loc.img.yellowproduct");
		String expect="Yellow";

		driver.findElement(By.id("pa_color")).sendKeys("Yellow");
		String actual=Helper.getTextOfElement("loc.text.product");
		log.printLog("Actual value is" +actual );
		
		asert.Assertion(actual, expect, "Values matched");
		
		
		driver.navigate().to("http://shop.demoqa.com/shop");
		
		Helper.clickOnElement("loc.link.sorting");
	}
}
		
		
			

		


