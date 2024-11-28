package SelectClassMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingSlectMethodsInFaceBookPage {

	private static final WebElement[] WebElement = null;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/");
		WebElement monthdropdown = driver.findElement(By.id("month"));
		WebElement daydropdown = driver.findElement(By.id("day"));
		WebElement yeardropdown = driver.findElement(By.id("year"));

		Select select = new Select(monthdropdown);
		// for selecting single values or element from dropdowns there are total 3
		// methods which are given below.
		/*
		 * select.selectByIndex(0); Thread.sleep(3000); select.selectByValue("5");
		 * Thread.sleep(3000); select.selectByVisibleText("Nov");
		 */

		List<WebElement> monthoptions = select.getOptions();
		for (WebElement x : monthoptions) {
			String value = x.getAttribute("value");
			select.selectByValue(value);
			Thread.sleep(1000);
		}

		// automation all the options of date dropDown by using selectbyIndex
		select = new Select(daydropdown);

		// verifying date dropdown is single select or multi select

		if (select.isMultiple())
			System.out.println("date dropdown is a multi select dropdown");
		else
			System.out.println("date is a single select dropdown");

		List<WebElement> dateoptions = select.getOptions();
		int i = 0;
		for (WebElement x : dateoptions) {
			select.selectByIndex(i);
			Thread.sleep(500);
			i++;
		}

		// Automation all the options of year dropdown by using SelectByVisibletext
		select = new Select(yeardropdown);
		
		List<WebElement> yearoptions = select.getOptions();
		for (WebElement x : yearoptions) {
			String text = x.getText();
			select.selectByVisibleText(text);
			Thread.sleep(250);
		}

	}

}
