package Day1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practiceswitchingtotab {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String expectedURL = "https:/www.Zomato.com/";
		driver.manage().window().maximize();
		driver.get("https:/www.fossil.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https:/www.Zomato.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https:/www.Swiggy.com/");
		Thread.sleep(3000);
		Set<String> allwindowId = driver.getWindowHandles();
		for (String windowid : allwindowId) {
			driver.switchTo().window(windowid);
			Thread.sleep(3000);

			String actualURL = driver.getCurrentUrl();
			if (actualURL.contains("Zomato")) {
				break;
			}

		}

	}

}
