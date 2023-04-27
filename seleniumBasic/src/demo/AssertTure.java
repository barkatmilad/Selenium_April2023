package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssertTure {
	ChromeDriver driver;
	@BeforeTest
	public void launchApplication() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void verifyTextApplication() {

		boolean actualText = driver.findElement(By.xpath("//h2[contains(@class,eso)]")).isDisplayed();
		Assert.assertTrue(actualText);
	}
	
	@AfterTest
	public void Closebrowser() {
		driver.quit();
	}

}
