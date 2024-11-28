package locatorsstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstclassprogram {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.facebook.com/");
		driver.manage().window().maximize();

		WebElement emaillck = driver.findElement(By.id("email"));
		emaillck.sendKeys("Damini");

		WebElement passlck = driver.findElement(By.id("pass"));
		passlck.sendKeys("1234");
		driver.findElement(By.name("login")).click();

	}

}
