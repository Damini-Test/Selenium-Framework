package Day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		String valdtstring = driver.getTitle();

		if (valdtstring.equals("nopcommerce demo")) {
			System.out.println("Test passed");

		} else {
			System.out.println("Test Failed");

		}

		driver.close();
	}

}
