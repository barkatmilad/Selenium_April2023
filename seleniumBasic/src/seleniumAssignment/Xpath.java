package seleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.yatra.com/");
		driver.findElement(By.xpath("(//div[contains(@class,'fare-summary')])[1]")).getText();
		driver.findElement(By.xpath("(//div[contains(@class,'fare-summary')])[1]")).getText();
		driver.findElement(By.xpath("(//input[contains(name,'first_name')])")).getText();
		
//		How to make a Xpath?
//		1) First we are going to wtire the method. 
//		A) driver.findElement(By.xpath(""))

//		2) make a xpath. this is the general rule for writting a xpath
//		a) tagname[contains(@attribute,'value')]
//Example) (//input[contains(name,'first_name')]).getText();
		driver.findElement(By.xpath("(//input[contains(name,'first_name')])")).getText();
		}

}
