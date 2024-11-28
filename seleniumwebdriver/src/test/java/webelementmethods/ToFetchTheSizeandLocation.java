package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchTheSizeandLocation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailtextBox = driver.findElement(By.id("email"));
		WebElement passtextBox = driver.findElement(By.id("passContainer"));
		// System.out.println(emailtextBox.getSize());
		// System.out.println(passtextBox.getSize());
		Dimension emailtextBoxSize = emailtextBox.getSize();
		Dimension passtextBoxSize = passtextBox.getSize();

		Point emailtextBoxlocation = emailtextBox.getLocation();
		Point passtextBoxLocation = passtextBox.getLocation();

		// System.out.println(emailtextBoxlocation.getX()- passtextBoxLocation.getX());
		int LeftAlignDifference = emailtextBoxlocation.getX() - passtextBoxLocation.getX();
		if (LeftAlignDifference > -5 && LeftAlignDifference < 5) {
			System.out.println("Left Aligh is perfect");

		}

		else {
			System.out.println("Left align is not correct");
		}

		int RightAlignDifference = (emailtextBoxlocation.getX() + emailtextBoxSize.getWidth())
				- (passtextBoxLocation.getX() + passtextBoxSize.getWidth());

		if (RightAlignDifference > -5 && RightAlignDifference < 5) {
			System.out.println("Right Aligh is perfect");

		}

		else {
			System.out.println("Right Align is not correct");
		}
		
		
		int Overlapdifference= (passtextBoxLocation.getY()-(emailtextBoxlocation.getY()+ emailtextBoxSize.getHeight()));
		System.out.println(Overlapdifference);
		
		if (Overlapdifference > 0) {
			System.out.println("Not Overlap");

		}

		else {
			System.out.println("Overlapped");
		}
		


	}
}
