package locatorsstrategies;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ContainsLocatorProgram {

	public static void main(String[] args) {
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.findElement(By.linkText("Log in")).click();
		 String text=driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]")).getText();
		 System.out.println(text);
		 
		 
	}

}
