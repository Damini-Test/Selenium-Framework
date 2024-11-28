package org.genericUtilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners extends BaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		LocalDateTime ldt= LocalDateTime.now();
		String timestamp=ldt.toString().replaceAll(":", "-");
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File desc= new File("./errorshots/"+timestamp+"screenshot.png");
		try {
			FileHandler.copy(src,desc);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		}
	
}
