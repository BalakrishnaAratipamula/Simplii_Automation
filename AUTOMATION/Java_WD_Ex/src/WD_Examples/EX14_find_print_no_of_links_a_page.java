//write script to find number of links in rediffmail homepage and print those links in console
package WD_Examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class EX14_find_print_no_of_links_a_page {
	public static void main(String[] args) {
		//to initialize the browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://rediffmail.com");
		driver.manage().window().maximize();

		//to get links information
		List<WebElement> elements = driver.findElements(By.tagName("a"));//tagName("a")---- is common for all links
		System.out.println("Number of links are: "+elements.size());

		//to print all links name
		for(WebElement links: elements) {
			System.out.println(links.getText());
		}	
	}
}