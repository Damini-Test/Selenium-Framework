package Actions_Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDragAndDropUsingWebElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		// WebElement capital =driver.findElement(By.id("box1"));
		// WebElement country =driver.findElement(By.id("box101"));
		Actions action = new Actions(driver);
		for (int i = 1; i <= 7; i++) {
			WebElement capital = driver.findElement(By.id("box"+i));
			WebElement country = driver.findElement(By.id("box10"+i));
			action.dragAndDrop(capital, country).perform();

		}

	}

}
