package PracticeForInterview;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodsProgram {

	public static void main(String[] args) {
		 WebDriver driver= new ChromeDriver();
		  driver.get("https://www.amazon.in/");
		  String url=driver.getCurrentUrl();
		  System.out.println(url);
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getPageSource());
		  System.out.println(driver.getWindowHandle());
		  System.out.println(driver.getWindowHandles());
		 
	}

}
