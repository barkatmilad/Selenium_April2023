package seleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise50 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		driver.findElement(By.name("frist_name")).sendKeys(" Milad");
		driver.findElement(By.name("last_name")).sendKeys("Azizi");
		driver.findElement(By.name("business_name")).sendKeys("barkat");
		driver.findElement(By.name("email")).sendKeys("barkat.yawari@com");
		driver.findElement(By.xpath("(//input[contains(name,'first_name')])")).getText();
		
		
	}

}
