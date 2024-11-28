package Actions_Pack;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDragAndDropByCoordinates {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.paiinternational.in/shop/categories/furniture-2/");
		 Thread.sleep(3000);
		WebElement Fromslider = driver.findElement(By.xpath("//span[@class='irs-slider from']"));
		
		Actions actions= new Actions(driver);
		actions.dragAndDropBy(Fromslider, 30, 0).pause(2000).dragAndDropBy(Fromslider, -30, 0).perform();
		
		WebElement toSlider = driver.findElement(By.xpath("//span[@class='irs-slider to']"));
		actions.dragAndDropBy(toSlider, -50, 0).pause(Duration.ofSeconds(4)).dragAndDropBy(toSlider, 50, 0).perform();
		
		
		 

	}

}
