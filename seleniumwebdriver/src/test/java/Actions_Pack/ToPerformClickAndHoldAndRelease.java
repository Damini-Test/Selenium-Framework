package Actions_Pack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformClickAndHoldAndRelease {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-2.html");
		WebElement cat =driver.findElement(By.id("box1"));
		WebElement dropbox =driver.findElement(By.id("dropBox"));
		Actions action = new Actions(driver);
		
		action.moveToElement(cat).clickAndHold( ).perform();
		action.moveToElement(dropbox).release().perform();

	}

}
