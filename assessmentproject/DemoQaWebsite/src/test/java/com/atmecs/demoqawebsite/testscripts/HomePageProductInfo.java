package com.atmecs.demoqawebsite.testscripts;

import org.testng.annotations.DataProvider;
import com.atmecs.demoqawebsite.helper.ExcelReading;
import com.atmecs.demoqawebsite.testsuite.TestBase;
import com.atmecs.demoqawebsite.utils.CommonUtils;

public class HomePageProductInfo extends TestBase
{
//	public boolean isProductPresentOnHomePage(WebDriver driver, String productName) {
//		return commonUtils.isElementPresentAndClickable(driver, getProductLinkXpath(productName));
//	}
	CommonUtils commonUtils = new CommonUtils();
	
	@DataProvider
	public Object[][] getExcelData()
	{
		Object[][] data = ExcelReading.getTestData("Sheet1");
		return data;
	}
	
	public void CheckProductIsPresent(String productName,String price,String ratings)
	{
		
		
		
	}
	
	
}
