package org.popups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToAvoidFileUploadPopUpInNoukari {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://naukri.com/registration/createAccount");
		driver.findElement(By.xpath("//h2[contains(text(),'experience')]")).click();
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\91899\\Desktop\\AutoIT23.exe");
		//sendKeys("C:\\Users\\91899\\Desktop\\Damini_Varle_CV");
		
		 	}

}
