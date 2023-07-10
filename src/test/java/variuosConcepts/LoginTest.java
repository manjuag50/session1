package variuosConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		
//		set System property(key,value)
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manju\\Selenium\\crm\\driver\\chromedriver.exe");
////		OR
////		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");// to copy others path, ur colleague
////		OR
//		System.setProperty("webdriver.chrome.driver", ".driver\\chromedriver.exe");
////		OR
//		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		
		
//		 Chrome Object
		WebDriver driver = new ChromeDriver();
		
//		delete cookies
		driver.manage().deleteAllCookies();
		
//		to maximize
		driver.manage().window().maximize();
		
//		go to website
		driver.get("http://www.techfios.com/billing/?ng=admin/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
//	username	
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		
//	password
		driver.findElement(By.id("password")).sendKeys("abc123");
		
//	login
		driver.findElement(By.name("login")).click();
		
//		close the window
		driver.close();
		
		
		
		
	}
	
	
}
