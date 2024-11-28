package org.TestNgWorks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestngDemo {

	// WebDriver driver = new EdgeDriver();
	WebDriver driver = new ChromeDriver();

	@Test
	public void launchGoogle() throws InterruptedException {
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("Logged out");
		driver.close();
	}
	@Test
    public void test1() {
		System.out.println("Hello");
	}
	@Test
   	public void test2() {
		System.out.println("Hello Damini");

	}

}
