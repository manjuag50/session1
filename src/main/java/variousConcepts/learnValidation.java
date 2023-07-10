package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class learnValidation {

		WebDriver driver;
		
		@Before
		public void init() {
			System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();  
			driver.get("https://www.techfios.com/billing/?ng=admin");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
		
		@Test
		public void loginTest() {
			
//			for variable
//			dataType variableName = value;// storing in WebElement below
			
			WebElement userNameElement = driver.findElement(By.xpath("//input[@id='username']"));//Selenium gives us the Class 'webElement' to store the values                                                                                   
			WebElement passwordElement = driver.findElement(By.xpath("//input[@id='password']"));
			WebElement signInButtonElement = driver.findElement(By.xpath("//button[@name='login']"));


//			Storing in BY Class: we are just storing the values. we are neither returning nor doing anything. just storing the values to the variables.
			
			By userNameField = By.xpath("//input[@id='username']");
			By passwordField = By.xpath("//input[@id='password']");
			By signInButtonField = By.xpath("//button[@name='login']");
			By dashboardHeaderField = By.xpath("//div[@class='col-lg-12']/descendant::h2");
			
			driver.findElement(userNameField).sendKeys("demo@techfios.com");
			driver.findElement(passwordField).sendKeys("abc123");
			driver.findElement(signInButtonField).click();

//we cannot keep dashBoardheader Element together above with other elements as the driver will look for dashboard header after clicking login button	
//			WebElement dashboardHeaderElement = driver.findElement(By.xpath("//div[@class='col-lg-12']/descendant::h2"));
			
			boolean dashboardPageIsDisplayed;
			
			try {
				WebElement dashboardHeaderElement = driver.findElement(By.xpath("//div[@class='col-lg-12']/descendant::h2"));
				 dashboardPageIsDisplayed = true;
			}catch(Exception e) {
				 dashboardPageIsDisplayed = false;
			}
			
			WebDriverWait wait = new WebDriverWait(driver,9);
			wait.until(ExpectedConditions.visibilityOfElementLocated(dashboardHeaderField));
			
			Assert.assertTrue("Dashboard page is not found",dashboardPageIsDisplayed);
			
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		}
	
	
	
	
	
	
	
	
	
	


