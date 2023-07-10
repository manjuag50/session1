package variuosConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class h1 {
	
	WebDriver driver;
	
	@Before
	public void init() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manju\\Selenium\\crm\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
			
//1: Open Browser and go to site http://www.techfios.com/billing/?ng=admin/ 
	
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.techfios.com/billing/?ng=admin/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	@Test
	public void loginIn() throws InterruptedException {	
//2. Enter username: demo@techfios.com 
		
		driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("demo@techfios.com");
		
		
//3. Enter password: abc123
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abc123");
		
//4. Click login button

		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);
		
//5. Click on Bank & Cash button
		driver.findElement(By.xpath("//span[text()='Bank & Cash']")).click();
//		Thread.sleep(2000);
		
//6. Click on New Account button 
		driver.findElement(By.xpath("//a[text()='New Account']")).click();
		
//7. Fill out the Add New Account form	
		driver.findElement(By.xpath("//input[@id='account']")).sendKeys("StudentMGA");
		driver.findElement(By.xpath("//input[@id='description']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@id='balance']")).sendKeys("$123645");
		driver.findElement(By.xpath("//input[@id='account_number']")).sendKeys("000000000");
		driver.findElement(By.xpath("//input[@id='contact_person']")).sendKeys("MGA");
		driver.findElement(By.xpath("//input[@id='contact_phone']")).sendKeys("22222222222");
		driver.findElement(By.xpath("//input[@id='ib_url']")).sendKeys("www.online.com");
	}
	
	
		@After
		public void tearDown() {
//8. Click on submit button
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		}
	
	/*
9. Visually check if the account has been created
Visually check to make sure the deposit posted*/
	
	
}
