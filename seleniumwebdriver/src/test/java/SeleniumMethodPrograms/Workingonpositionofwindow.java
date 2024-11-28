package SeleniumMethodPrograms;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingonpositionofwindow {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.one8.com/");
		Point position = driver.manage().window().getPosition();
		System.out.println(position);

		System.out.println("X Cordinate :" + position.getX());
		System.out.println("Y Cordinate :" + position.getY());
		
		
		Point targetpositionn = new Point(400 ,20);
		Thread.sleep(3000);
		//Changing position of screen by using setPosition 
		driver.manage().window().setPosition(targetpositionn);

	}

}
