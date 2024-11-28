package org.IFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleNestedFrames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoqa.com/nestedframes");
		driver.switchTo().frame("frame1");
		WebElement parentframetext = driver.findElement((By.tagName("body")));
		String text1 = parentframetext.getText();
		System.out.println(text1);
		WebElement childframe = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(childframe);
		String text2 = driver.findElement(By.tagName("p")).getText();
		System.out.println(text2);
		driver.switchTo().parentFrame();
		System.out.println(parentframetext.getText());

	}

}
