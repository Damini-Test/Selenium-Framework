package webelementmethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformLoginInDWS {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		WebElement emailTexBox = driver.findElement(By.id("Email"));
		//emailTexBox.sendKeys("admin02@gmail.com",Keys.TAB,"Admin02",Keys.ENTER);
		emailTexBox.sendKeys("admin02@gmail.com",Keys.CONTROL+"a");
		Thread.sleep(2000);
		emailTexBox.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(3000);
		emailTexBox.sendKeys(Keys.TAB,Keys.CONTROL+"v");
		emailTexBox.clear();
		emailTexBox.sendKeys("admin02@gmail.com",Keys.TAB,"Admin02");
        driver.findElement(By.xpath("//input[@value='Log in']")).submit();
		
		
		
		

	}

}
