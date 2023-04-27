package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssertFalse {
		ChromeDriver driver;
	@BeforeTest
	public void luachApplication() {
//		Open the browser
		driver= new ChromeDriver();
		
//		maximize the window
		driver.manage().window().maximize();
		
//		Navigate to application
		driver.get("https://letcode.in/buttons");
	}

	@Test
	public void VerifyEnableButton() {
		boolean actualButton = driver.findElement(By.id("isDisabled")).isEnabled();
		Assert.assertFalse(actualButton);
	}
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
