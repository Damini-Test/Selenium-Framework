package org.datadriventesting;

import java.time.Duration;

import org.automation_generic_utilities.ReadTestdata;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWSLogin {

	public static void main(String[] args) throws InterruptedException {
		 String url=ReadTestdata.readDataFromProperties("url");
		String email= ReadTestdata.readDataFromProperties("email");
		String password=ReadTestdata.readDataFromProperties("password");
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get(url);
		 driver.findElement(By.linkText("Log in")).click();
		 driver.findElement(By.id("Email")).sendKeys(email);
		 driver.findElement(By.id("Password")).sendKeys(password);
		 driver.findElement(By.xpath("//input[@value='Log in']")).click();
		 Thread.sleep(2000);
		 driver.quit();
		 
		 
	}

}
