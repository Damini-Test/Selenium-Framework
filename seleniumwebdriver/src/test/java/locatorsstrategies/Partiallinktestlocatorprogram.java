package locatorsstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Partiallinktestlocatorprogram {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.suzukimotorcycle.co.in/product-details/hayabusa");
		driver.get("https://www.amazon.in/");
		driver.findElement(By.partialLinkText("Mobiles")).click();
		driver.findElement(By.partialLinkText("MOTOROLA Edge 50")).click();
		
	}

}
