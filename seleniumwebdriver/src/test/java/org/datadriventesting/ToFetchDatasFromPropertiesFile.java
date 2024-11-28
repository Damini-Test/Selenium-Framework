package org.datadriventesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.automation_generic_utilities.ReadTestdata;

public class ToFetchDatasFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		 File f= new File(".\\Test-Resources\\DWS.properties");
		 FileInputStream fis =new FileInputStream(f);
	     Properties prop=new Properties();
	     
	     prop.load(fis);
	     String url= prop.getProperty("url");
	     String brws= prop.getProperty("browser");
	     String email= prop.getProperty("email");
	     String psscode= prop.getProperty("password");
	     //System.out.println(url);
	     //System.out.println(brws);
	    // System.out.println(email);
	     //System.out.println(psscode);
	     
	     System.out.println(ReadTestdata.readDataFromProperties("url"));

	     
}
}
