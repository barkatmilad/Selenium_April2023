package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
	public static void main(String[] args) {
//	1) open the browser
		ChromeDriver driver = new ChromeDriver();
		
//	2) Maximize it
		driver.manage().window().maximize();
		
//	3) Navigate to application
		driver.get("https://letcode.in/buttons");
//	4) Verify the button with ' Disabled' is disabled or not clickable by defualt in the page or no?.
		boolean disabledStatus = driver.findElement(By.id("isDisabled")).isEnabled();
		
		if(disabledStatus == true) {
			System.out.println(" The Enabled Button is not clickable");
		}
		
		else {
			System.out.println(" The enabled button is click able");
		}
//	5) close the browser 
		driver.quit();
//		
	}

}
