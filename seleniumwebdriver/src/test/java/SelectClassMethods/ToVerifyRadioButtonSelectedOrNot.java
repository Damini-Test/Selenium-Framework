package SelectClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyRadioButtonSelectedOrNot {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/reg/");
		 WebElement maleradioButton = driver.findElement(By.xpath("//label[text()='Male']/..//input[@type='radio']"));
		 WebElement customRadioButton = driver.findElement(By.xpath("//label[text()='Custom']/..//input[@type='radio']"));
		WebElement customGenderTexBox = driver.findElement(By.id("custom_gender"));
		 //checking mailradioButton is selected or not, if not selected ,we are clicking on it.
		if(!maleradioButton.isSelected()) {
			maleradioButton.click();
		}
		 
		// checking customGenderTexBox is displayed or not ,if not , we are clicking on customRadioButton
		// so that customGenderTexBox will display
		
		
		if (!customGenderTexBox.isDisplayed())
		{
			customRadioButton.click();
		}
		customGenderTexBox.sendKeys("Custom");
		 

	}

}
