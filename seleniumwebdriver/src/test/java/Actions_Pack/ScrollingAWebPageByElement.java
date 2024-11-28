package Actions_Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingAWebPageByElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/allcompanies");
		WebElement FndElement = driver.findElement(By.xpath("//span[text()='Location']"));
		Actions action = new Actions(driver);
		action.scrollToElement(FndElement).perform();

	}

}
