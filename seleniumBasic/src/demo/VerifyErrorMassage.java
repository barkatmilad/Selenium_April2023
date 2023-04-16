package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMassage {
// 1	write a main method.
	public static void main(String[] args) {
// 2	open the Google or chrome browser.
		ChromeDriver driver = new ChromeDriver();
		
// 3	Navigate to Facebook application.
		driver.get(" https://facebook.com");
		
// 4   Enter invalid email address into email textbox.
		driver.findElement(By.id("email")).sendKeys("barkadyawari@gmail.com");
		
// 5 Enter invalid password in password text box.
		driver.findElement(By.id("pass")).sendKeys("barkat11111");
		
// 6 Click on login Button.		
		driver.findElement(By.name("login")).click();
		
// 7 verify the error massage.--The email you entered isn’t connected to an account. Find your account and log in.	
		String expectedErrorMassage = "The email you entered isn’t connected to an account. Find your account and log in.";
		String actualErrorMassage = driver.findElement(By.cssSelector("#email_container > div._9ay7")).getText();
	
		if(expectedErrorMassage.equals(actualErrorMassage)) {
			System.out.println(" Test case passed");
			}
		
		else {
			System.out.println(" Test case failed");
		}
//		close the browser.
		driver.quit();
		
		}
	
		
		
	}


