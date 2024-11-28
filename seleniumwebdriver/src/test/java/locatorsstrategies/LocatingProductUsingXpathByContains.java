package locatorsstrategies;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocatingProductUsingXpathByContains {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='Mobiles']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//a[contains(@title,'Motorola Edge 50 Fusion')]")).click();
		
		 }
	
	

}
