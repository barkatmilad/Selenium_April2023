package demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VerifyTitle {
	public static void main(String[] args) {

//		open a browser
		
		ChromeDriver driver = new ChromeDriver();
		
//		navigate to application. what code we should write to navigate the application?
		driver.get("https://LinkedIn.com");
//		Verify the user sees the title - LinkedIn: Long in or Sign up.
		String expectedTitle = "LinkedIn: Log In or Sign Up";
		String actualTitle = driver.getTitle();
		System.out.println(expectedTitle);
		System.out.println(actualTitle);
		
		if ( expectedTitle.equals(actualTitle)) {
			System.out.println("Test case is passed");
		}
		
		else {
			System.out.println(" Test fale");
		}
		driver.quit();
	
		
	}

}
