package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://twitter.com");
		String expectedTitle = "Explore / Twitter";
		String acualTitle = driver.getTitle();
		System.out.println(expectedTitle);
		System.out.println(acualTitle);
		
		if (expectedTitle.equals(acualTitle)) {
			System.out.println(" Passed");
		}
		else {
			System.out.println(" Failed");
		}
		driver.quit();
	}

}
