package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
//	1) open the browser
		ChromeDriver driver = new ChromeDriver();
//	2) Maximize it
		driver.manage().window().maximize();
//	3) Navigate to application
		driver.get("https://letcode.in/dropdowns");
//	4) Select apple from first drop down 
		WebElement fruitsDropDown = driver.findElement(By.id("fruits"));
		Select selectFruits = new Select(fruitsDropDown);
		selectFruits.selectByVisibleText("Apple");
//		select orange from first drop down.
		selectFruits.selectByVisibleText("Orange");
	}

}
