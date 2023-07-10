package variuosConcepts;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginTest_JUnit {
//	Chrome Object
	static WebDriver driver;

		@Before
		public void launchBrowser() {
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
		@Test
		public void loginTest() throws InterruptedException {
//			username	
			driver.findElement(By.id("username")).sendKeys("demo@techfios.com");

//			password
			driver.findElement(By.id("password")).sendKeys("abc123");

//			login
			driver.findElement(By.name("login")).click();

//				to wait for 3 seconds
			Thread.sleep(3000);

		}
		@Test
		public void negLoginTest() throws InterruptedException {
//			username	
			driver.findElement(By.id("username")).sendKeys("demo@techfios1.com");

//			password
			driver.findElement(By.id("password")).sendKeys("abc123");

//			login
			driver.findElement(By.name("login")).click();

//				to wait for 3 seconds
			Thread.sleep(3000);

		}
		@After
		public void tearDown() {
//			close the window
			driver.close();
		}
		@Test
		public void negPasswordTest() throws InterruptedException {
//			username	
			driver.findElement(By.id("username1")).sendKeys("demo@techfios1.com");

//			password
			driver.findElement(By.id("password")).sendKeys("abc123ghg");

//			login
			driver.findElement(By.name("login")).click();

//				to wait for 3 seconds
			Thread.sleep(3000);

		}
		@BeforeClass
		public static void beforeMethod() {
			System.out.println();
		}
		@AfterClass
		public static void afterMethod() {
			System.out.println("after method");
		}
		

}
