package com.atmecs.demoqawebsite.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelReading
{
	static Workbook book;
	static Sheet sheet;
	static Object[][] data;
	
	
	
	public static String TESTDATA_SHEET_PATH="C:\\Users\\Sampada.Joshi\\new_assessment_workspace\\DemoQaWebsite\\resources\\productinfo.xlsx";
	public static Object[][] getTestData(String sheetName)
	{
		FileInputStream file=null;
		try {
			file=new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			book=WorkbookFactory.create(file);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		sheet=book.getSheet(sheetName);
		
		 data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		 
		 
		 //logic for getting all rows from excel
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
			for(int k=0;k<sheet.getRow(0).getLastCellNum();k++)
			{
				data[i][k]=sheet.getRow(i+1).getCell(k).toString();
				
			}
		}
		 return data;
		
	}
}
