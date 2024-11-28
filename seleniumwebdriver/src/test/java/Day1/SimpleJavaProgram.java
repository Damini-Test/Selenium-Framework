package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class SimpleJavaProgram {
	public static void main(String args[]) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		//driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		System.out.println("Logged out");
		driver.close();
	}

}
