package Day1;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceProgramFile {

	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
		WebElement lck = driver.findElement(By.id("twotabsearchtextbox"));
		lck.sendKeys("iphone 16");
	    WebElement submitbtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	    submitbtn.click();
		WebElement addtocartbutton = driver.findElement(By.xpath("//button[text()='Add to cart']"));
		addtocartbutton.click();
		WebElement lck1 = driver.findElement(By.id("twotabsearchtextbox"));
		lck1.sendKeys("Table");
	    WebElement submitbtn1 = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	    submitbtn1.click();
		
		
		
		
		

		 
		
		 		 		
		}
	}



