package locatorsstrategies;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;	
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextProgram {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jawamotorcycles.com/");
		driver.findElement(By.linkText("MOTORCYCLES")).click();
		
		 

	}

}
