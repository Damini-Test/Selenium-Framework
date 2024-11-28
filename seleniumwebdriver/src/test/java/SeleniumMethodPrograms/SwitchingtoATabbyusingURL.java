package SeleniumMethodPrograms;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingtoATabbyusingURL {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String expectedURL = "https://www.titan.co.in/";
		driver.manage().window().maximize();
		driver.get("https://www.fossil.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.titan.co.in/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.fastrack.in/");
		Set<String> allWindowId = driver.getWindowHandles();
		for (String windowId : allWindowId) {
			driver.switchTo().window(windowId);
			Thread.sleep(3000);

			String actualURL = driver.getCurrentUrl();
			if (actualURL.equals(expectedURL));
			{
				break;
			}

		}

	}

}
