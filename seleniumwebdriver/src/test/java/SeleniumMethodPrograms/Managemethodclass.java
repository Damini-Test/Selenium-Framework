package SeleniumMethodPrograms;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Managemethodclass {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver = new ChromeDriver();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);

		// Working on size of window

		Dimension size = driver.manage().window().getSize();
		System.out.println(size);

		 //Using Dimension Class methods to fetch height and width
		System.out.println("Hight :" + " " + size.getHeight());
		System.out.println("Width :" + " " + size.getWidth());
		Thread.sleep(3000);

		// Set the size of browser

		// Creating Dimension object by passing width and Height in
		// Dimension(Width,Height)
		Dimension targetsize = new Dimension(300, 400);

		//changing the Size by using setSize();
		driver.manage().window().setSize(targetsize);
		
		//Dimension size = driver.manage().window().getSize();
		 //System.out.println(size);


	}

}
