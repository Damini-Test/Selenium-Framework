package SelectClassMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement CarsDropDown = driver.findElement(By.id("multiselect1"));////select[@id="multiselect1"]
		Select select = new Select(CarsDropDown);
       
		// Verfing dropdown is multi select or not 
		if (select.isMultiple()) {
			System.out.println("it is Multi select drop down");
		} else {
			System.out.println("it is Single select drop down");

		}
		
		//fetching all the options
		
		List<WebElement> options=select.getOptions();
		for(WebElement option: options)
		{
			String text=option.getText();
			select.selectByVisibleText(text);
		}
		
	    Thread.sleep(2000);
	    //deselection based on index
	    select.deselectByIndex(2);
	    
	    Thread.sleep(1500);
		//deselection based on value attributes value
		select.deselectByValue("swiftx");
		
		
		
		Thread.sleep(1500);
        //deselection based on visible text
		select.deselectByVisibleText("Audi");
		
		
		Thread.sleep(2000);
	    // deselect all 
		select.deselectAll();//*/
		

	}
}



