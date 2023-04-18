package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplay {
	public static void main(String[] args) {
//	1) open the browser
		ChromeDriver driver = new ChromeDriver();
//	2) Maximize it
		driver.manage().window().maximize();
//	3) Navigate to application
		driver.get("https://facebook.com");
//	4) Verify the text 'Connect with friends and the world around you on Facebook.' is diplay to visitor of no?
		boolean textStatus = driver.findElement(By.xpath("//h2[contains(@class,'eso')]")).isDisplayed();
		if(textStatus == true) {
			System.out.println(" Test case passed");
		}
		else {
			System.out.println(" Text Case failed");
		}
//	5) close the browser
		driver.quit();
	}
	

}
