// write program to verify entered value is displayed in Email edit box same as entered value in FB-home page
package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX02_Printing_entered_value_in_Editbox {
	public static void main(String[] args) throws Exception {
		//to initialize the browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://en-gb.facebook.com/");
		driver.manage().window().maximize();

		String str1 = "Himaja";

		//create reference object for Email editbox
		WebElement emailObj = driver.findElement(By.name("email"));
		//to clear value in Email editbox
		emailObj.clear();
		//to enter String
		emailObj.sendKeys(str1);
		Thread.sleep(1000);

		//to read value from editbox
		String str2 = emailObj.getAttribute("value");
		System.out.println("Entered data in edit box is:  "+str2);
		//to compare value
		if(str2.equals(str1)) {
			System.out.println("Expected value displayed");
		}
		else {
			System.out.println("Wrong value displayed");
		}

	}
}
