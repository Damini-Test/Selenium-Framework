package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSitePractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in");
		driver.get("https://www.purplle.com");
		driver.get("https://www.goindigo.com");
		driver.get("https://www.goindigo.com");
		String windowId = driver.getWindowHandle();
		System.out.println(windowId);
		String sourceCd = driver.getPageSource();
		System.out.println(sourceCd);
        String url=driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// driver.get(a[href="/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles"]).click();

	}

}
