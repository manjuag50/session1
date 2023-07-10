package variuosConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class negativeCallingMethod {
//	Chrome Object
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	
		launchBrowser();
		loginTest();
		tearDown();
		
		launchBrowser();
		negLoginTest();
		tearDown();
		
	}
		
		public static void launchBrowser() {
//			set System property(key,value)
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\manju\\Selenium\\crm\\driver\\chromedriver.exe");
////			OR
////			System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");// to copy others path, ur colleague
////			OR
//			System.setProperty("webdriver.chrome.driver", ".driver\\chromedriver.exe");
////			OR
//			System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

			driver = new ChromeDriver();

//			delete cookies
			driver.manage().deleteAllCookies();

//			to maximize
			driver.manage().window().maximize();

//			go to website
			driver.get("http://www.techfios.com/billing/?ng=admin/");

		}

		public static void loginTest() throws InterruptedException {
//			username	
			driver.findElement(By.id("username")).sendKeys("demo@techfios.com");

//			password
			driver.findElement(By.id("password")).sendKeys("abc123");

//			login
			driver.findElement(By.name("login")).click();

//				to wait for 3 seconds
			Thread.sleep(3000);

		}
		public static void negLoginTest() throws InterruptedException {
//			username	
			driver.findElement(By.id("username")).sendKeys("demo@techfios1.com");

//			password
			driver.findElement(By.id("password")).sendKeys("abc123");

//			login
			driver.findElement(By.name("login")).click();

//				to wait for 3 seconds
			Thread.sleep(3000);

		}

		public static void tearDown() {
//			close the window
			driver.close();
		}
		

}
