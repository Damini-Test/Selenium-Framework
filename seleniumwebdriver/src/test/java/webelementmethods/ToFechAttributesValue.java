package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFechAttributesValue {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailTextBox = driver.findElement(By.id("email"));
		String email = "daminivarle@gmail.com";
		emailTextBox.sendKeys(email);
		String enteremail = emailTextBox.getAttribute("value");
		if (email.equals(enteremail)) {
			System.out.println("Email entered Successfully");

		} else {
			System.out.println("Email is not  entered properly");

		}
	}

}
