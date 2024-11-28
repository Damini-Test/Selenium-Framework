package org.DataProveder;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class MyDataProviderClass {
	@DataProvider(name="bregister Data Provider")
	public String[][] dataProviderMethod(){
	File f= new File(".\\Test-Resourse\\DWS.xlsx");
	FileInputStream fis= null;
	Workbook wb= null;
	try{
		fis= new FileInputStream(f);
		wb= WorkbookFactory.create(fis);
	}catch (Exception e) {
		
	}
	
	Sheet s= wb.getSheet("Sheet1");
	int rowCount =s.getPhysicalNumberOfRows();
	int cellCount= s.getRow(0).getPhysicalNumberOfCells();
	String[][] arr = new String[rowCount-1][cellCount];
	
	
	for(int i=1;i<rowCount;i++) {
		
	}
	
	
	
	}
	

}
