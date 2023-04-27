package seleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown3 {
	public static void main(String[] args) {
//	1) open the browser
		ChromeDriver driver = new ChromeDriver();
		
//	2) Maximize it
		driver.manage().window().maximize();
		
//	3) Navigate to application
		driver.get("https://letcode.in/dropdowns");
		
//	4) Select Colombia from third drop down 
		WebElement argentinaDropDown = driver.findElement(By.id("country"));
		Select selectcolombia = new Select (argentinaDropDown);
		selectcolombia.selectByVisibleText("Colombia");
	}
	

}
