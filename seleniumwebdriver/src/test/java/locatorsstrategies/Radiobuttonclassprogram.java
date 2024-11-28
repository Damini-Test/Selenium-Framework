package locatorsstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttonclassprogram {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/91899/Desktop/Radiobutton.html");
		WebElement textbox= driver.findElement(By.xpath(" //input[@id=\"f-name name=\" or @name=\"first\"]`"));//driver.findElement(By.xpath("//input[@name=\"gender\" and @value=\"M\"]"));
		textbox.clear();
		textbox.sendKeys("Damini");
		
		
	}

}
