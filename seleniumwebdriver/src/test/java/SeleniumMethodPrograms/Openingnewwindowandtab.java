package SeleniumMethodPrograms;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openingnewwindowandtab {

	public static void main(String[] args) throws InterruptedException {
		String expectedTitle = "Nestle: Good food,Good life | Nestle India";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://www.instagram.com/shabdavali__");
		driver.get("https://www.instagram.com/1_Banjara");
		String parentWindowId = driver.getWindowHandle();
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("www.nestle.in");
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.swiggy.com/");
		driver.switchTo().window(parentWindowId);
		Set<String> allwindowids = driver.getWindowHandles();
		for (String windowId : allwindowids) {
	    // System.out.println(windowId);
	    driver.switchTo().window(windowId);
		Thread.sleep(3000);
		String actualTitle = driver.getTitle();
		if (actualTitle.equals(expectedTitle)) {
		break;
			}
		}

	}

}
