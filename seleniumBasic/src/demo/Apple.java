package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class Apple {
	public static void main(String[] args) {
//		open a browser
		ChromeDriver driver = new ChromeDriver();
//		navigate to application. what code we should write to navigate the application?
		driver.get("http://apple.com");
//		verify the user sees the title - Apple.com
		String expectedTitle = "Apple";
		String acualTitle = driver.getTitle();
		System.out.println(expectedTitle);
		System.out.println(acualTitle);
		
		if (expectedTitle.equals(acualTitle)) {
			System.out.println(" Test case passed");
		}
		
		else {
			System.out.println(" The test is failed");
		}
		
		driver.quit();
		
//		hello how are you
		
		
	}

}
