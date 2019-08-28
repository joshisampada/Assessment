package com.atmecs.demoqawebsite.constants;

import java.io.File;

public class ProjectPathConstants 
{
	public static String currentdir = System.getProperty("user.dir") + File.separator;
	public static String resources = currentdir +  File.separator + "resources" + File.separator;
	public static final String locators = resources + File.separator + "locators" + File.separator;
	public static String lib = currentdir +  File.separator + "lib" + File.separator;
	
	//config
	public static String config = resources + "config.properties";
	public static  String objectrepo = locators + "objectrepo.properties";
}
