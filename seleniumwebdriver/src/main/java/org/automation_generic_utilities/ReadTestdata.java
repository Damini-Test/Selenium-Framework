package org.automation_generic_utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


/**
 * This method is used to fetch the data from properties file
 * @author damini varle
 * @retun value
 */
public class ReadTestdata implements FrameWorkConstant {

	public static String readDataFromProperties(String key) {
		File f = new File(".\\Test-Resources\\DWS.properties");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f);
		} 
		catch (FileNotFoundException e) {
		}

		Properties prop = new Properties();
		try {
          prop.load(fis);
		} catch (IOException e) {

		}
		return prop.getProperty(key);

	}
	
	
	
	/**
	 * 
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 */
	
	
	public static String readDatafromExel(String sheet,int row,int cell)
	{
		File f= new File(".\\Test-Resources\\DWS.properties");
		FileInputStream fis= null;
		try {
			fis= new FileInputStream(f);
		}
		catch(FileNotFoundException e)
		{
			
		}
		Workbook workbook= null;
		try
		{
			workbook= WorkbookFactory.create(fis);
		}
		catch (Exception e)
		{
			
		}
		//String data= workbook.getSheet(sheet).getRow(row).getCell(cell).toString();
		//return data;
		
		int roeCount= workbook.getSheet(sheet).getPhysicalNumberOfRows();
		return rowCount;
	}
	
	public int cellCount(String sheet, int row)
	{
		
	}
}
	
	
	

