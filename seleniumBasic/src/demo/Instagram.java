package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) {
//		open a browser
		ChromeDriver driver = new ChromeDriver();
//		navigate to application. what code we should write to navigate the application?
		driver.get("https://Instagram.com");
//		Verify the user sees the title - LinkedIn: Long in or Sign up.
		String expectedTitle = "Instagram";
		String acualTitle = driver.getTitle();
		
		if (expectedTitle.equals(acualTitle)) {
			System.out.println(" Test Case passed");
		}
		else {
			System.out.println(" Failed");
		}
//		close the browser
		driver.quit();
//		good to see you
		
	}

	
}
