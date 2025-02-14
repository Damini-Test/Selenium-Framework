package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToCaptureScreenshotOfAWebPage {

	public static void main(String[] args) throws IOException {
		LocalDateTime ldt = LocalDateTime.now();
		String timeStamp = ldt.toString().replaceAll(":", "-");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yamaha-motor-india.com/");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\errorshots\\"+timeStamp+"screenshot.png");
		FileHandler.copy(screenshot,dest);

	}

}
