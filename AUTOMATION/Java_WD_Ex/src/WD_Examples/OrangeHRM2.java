package WD_Examples;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM2 {
public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
				driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				driver.findElement(By.id("txtPassword")).sendKeys("admin123");
				driver.findElement(By.id("btnLogin")).click();
				driver.findElement(By.linkText("Admin")).click();
				driver.findElement(By.linkText("Configuration")).click();		
				driver.findElement(By.linkText("Email Configuration")).click(); 
				driver.findElement(By.id("editBtn")).click();
				Select a = new Select(driver.findElement(By.xpath("//select[@id='emailConfigurationForm_cmbMailSendingMethod']")));
				List<WebElement> options = a.getOptions();
				int sz = options.size();
				System.out.println("total dd options are: "+sz);
				for(int i=0; i<=sz-1; i++) {
					System.out.println(" ******************* The value of i is : ******************* "+i);
					driver.findElement(By.xpath("//select[@id='emailConfigurationForm_cmbMailSendingMethod']")).click();
					Thread.sleep(5000);
					a.selectByIndex(i);
					String s = options.get(i).getText();
					System.out.println(s);
					switch(s) {
					case ("Sendmail"):
						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						driver.findElement(By.id("emailConfigurationForm_txtMailAddress")).clear();
						driver.findElement(By.id("emailConfigurationForm_txtMailAddress")).sendKeys("bhanu10205@gmail.com");
						driver.findElement(By.id("emailConfigurationForm_chkSendTestEmail")).click();	
						driver.findElement(By.id("emailConfigurationForm_txtTestEmail")).sendKeys("bhanuelectrical205@gmail.com");
						driver.findElement(By.id("editBtn")).click();
						driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/form[1]/fieldset[1]/p[1]/input[1]")).click();
						Thread.sleep(5000);
						break;
					case ("SMTP"):
						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						driver.findElement(By.id("emailConfigurationForm_cmbMailSendingMethod")).click();
				    	driver.findElement(By.id("emailConfigurationForm_txtSmtpHost")).sendKeys("www.xyz.com");
				    	driver.findElement(By.id("emailConfigurationForm_txtSmtpPort")).sendKeys("45621");
				    	driver.findElement(By.id("emailConfigurationForm_optAuth_none")).click();
				    	driver.findElement(By.id("emailConfigurationForm_optSecurity_tls")).click();
				    	driver.findElement(By.id("emailConfigurationForm_chkSendTestEmail")).click();
				    	driver.findElement(By.id("emailConfigurationForm_txtTestEmail")).sendKeys("xyz@gmail.com"); 
				    	break;
						}
					}
				}
			
			
}

