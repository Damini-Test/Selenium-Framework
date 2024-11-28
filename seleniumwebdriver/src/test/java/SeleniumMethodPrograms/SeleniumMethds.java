package SeleniumMethodPrograms;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethds {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		driver.get("https://www.jawamotorcycles.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// navigation methods writing below
		// two type exception unchecked and checked exception ........
		Navigation nav = driver.navigate();
		nav.back();// driver.navigate().back();
		nav.forward(); //driver.navigate.forward();
		nav.refresh(); // driver.navigate.refresh();
		nav.to("https://in.bookmyshow.com/"); // driver.navigate.to("url");
		Thread.sleep(3000);
		//nav.to(new URL("https:www.myntra.com/"));
		driver.close();

	}

}
