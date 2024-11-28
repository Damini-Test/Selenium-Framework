package locatorsstrategies;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAllAddToCarts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 15");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		List<WebElement>addtocartbutton=driver.findElements(By.xpath("//button[text()='Add to cart']"));
		System.out.println(addtocartbutton.size());
		for(WebElement x :addtocartbutton) {
			x.click();
			Thread.sleep(3000);
			
			
		}
		 

	}

}
