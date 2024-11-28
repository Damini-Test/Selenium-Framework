package locatorsstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoshopsite {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();

		WebElement idmsd = driver.findElement(By.id("Email"));
		idmsd.sendKeys("dam");

		WebElement passmsd = driver.findElement(By.id("Password"));
		passmsd.sendKeys("54646567");
		
		driver.findElement(By.linkText("Register")).click();

		 driver.findElement(By.name("Gender")).click();
		
	     //driver.findElement(By.linkText("ico-login"));
		

	}

}
