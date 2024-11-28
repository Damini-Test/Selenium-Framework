package SeleniumMethodPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchingtoactiveelement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.co.in/");
		driver.get("https://demowebshop.tricentis.com/login");
        driver.manage().window().maximize();
		driver.switchTo().activeElement().sendKeys("Damini Rathod");
		Thread.sleep(3000);

	}

}
