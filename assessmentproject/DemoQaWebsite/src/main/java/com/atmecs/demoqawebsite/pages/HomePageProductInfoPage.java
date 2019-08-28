package com.atmecs.demoqawebsite.pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.atmecs.demoqawebsite.constants.ProjectPathConstants;
import com.atmecs.demoqawebsite.utils.CommonUtils;
import com.atmecs.demoqawebsite.utils.PropertiesUtil;

public class HomePageProductInfoPage 
{
	CommonUtils commonUtils = new CommonUtils();
	static Properties homepageproductinfo = PropertiesUtil.loadProperty(ProjectPathConstants.locators);
	
	
	public String getProductLinkXpath(String productName) {
		return homepageproductinfo.getProperty("loc.link.productname").replace("xxxxx", productName);
	}
	
	
}