package Tests;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestCases {	
	public WebDriver driver;

	@BeforeSuite
	public void LaunchBrowser() {		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		}	
	
	@AfterSuite
	public void QuitBrowser() {
	driver.quit();	
	}
	
	@Test
	public void Test1() {
		Assert.assertEquals("Practice Page", driver.getTitle());
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Home')]")).click();
		Assert.assertEquals("Rahul Shetty Academy", driver.getTitle());
	}
}
