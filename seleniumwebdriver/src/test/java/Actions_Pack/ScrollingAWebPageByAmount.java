package Actions_Pack;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingAWebPageByAmount {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ferrerorocher.com/in/en/");
		Actions action= new Actions(driver);
		action.pause(2000).scrollByAmount(0, 800).perform();
		
		
		 

	}

}
