package variuosConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnLocators {
	
		WebDriver driver;
		
		@Before
		public void init() {// init is used in the industry to launch browser
		
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		
		driver = new ChromeDriver();//it requires Run Configeration(line 16)
		
		driver.manage().deleteAllCookies();// FIRST: delete the cookies
		driver.manage().window().maximize();   // MAximize teh window
		driver.get("https://objectspy.space/");// because we work on this url
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// implicit wait to slow our execution down everytime when asking to find an element.
		}
	
		
		@Test
		public void testLocators() throws InterruptedException {
			driver.findElement(By.name("firstname")).sendKeys("Selenium");
			driver.findElement(By.id("sex-0")).click();
//			 upload file :::: Uploading file in .sendkeys only work with as long as it  is a input tag          video: june 11 (2:05)
//			 anything else use robot
			driver.findElement(By.id("photo")).sendKeys("C:\\Users\\manju\\OneDrive\\Desktop\\class interview questions.docx");
//			link text                                              : video : june 11 (2:19)
			driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
			Thread.sleep(2000);// to wait 2 seconds on previous link
//			to go back
			driver.navigate().back();
//			partial link text Partial link method looks for unique values. If there is no unique then its gonna launch first one.
			driver.findElement(By.partialLinkText("TF-API")).click();
			driver.navigate().back();
			driver.findElement(By.cssSelector("input#tool-2")).click();
			driver.findElement(By.cssSelector("input[value='Automation Tester'][id='profession-1']")).click();//used 2 attributes
//			XPATH by Absolute
//			driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[10]/input")).sendKeys("Trivedi");
			
//			XPATH by Relative
			driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("123");
			driver.findElement(By.xpath("//input[@name='lastname' and @type= 'text']")).sendKeys("is great.");
			driver.findElement(By.xpath("//strong[text()='Link Test : Page Change']")).click();
			Thread.sleep(1000);
			driver.navigate().back();
			driver.findElement(By.xpath("//strong[contains(text(),'Link Test : Page Change')]")).click();
			driver.navigate().back();
			driver.findElement(By.xpath("//strong[contains(text(),'Page Change')]")).click();//can be used partial too
			
			
			
			
		
			
			
		}
		
		
		
		
		
//		@After
		public void tearDown() {
			driver.close();
			driver.quit();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
