package PropertiesFile;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFileEx {
public static void main(String[] args) throws Exception {
	//to specify file path
	FileInputStream fi = new FileInputStream("./PropertiesF\\inputdata.properties");
	//create object for properties class
	Properties proObj = new Properties();	
	//to load properties file
	proObj.load(fi);	
	
	//to read data from properties file
	String key1=proObj.getProperty("key");//Key from properties file
	String value1=proObj.getProperty("value");
	String applnUrl=proObj.getProperty("baseUrl");
	String uid=proObj.getProperty("userId");
	String pass= proObj.getProperty("passWd");
	
	//To Initialize Browser
	System.setProperty(key1, value1);
	WebDriver driver= new ChromeDriver();
	driver.navigate().to(applnUrl);
	driver.manage().window().maximize();
	
	//to perform login operation
	driver.findElement(By.id("txtUsername")).sendKeys(uid);
	driver.findElement(By.id("txtPassword")).sendKeys(pass);
	driver.findElement(By.id("btnLogin")).click();
	
}
}
