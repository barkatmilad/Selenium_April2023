package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChechboxAndRadioBtn {
	public static void main(String[] args) {
//	1) Open the browser.
		ChromeDriver driver = new ChromeDriver();
		
//	2) Maximize the window.
		driver.manage().window().maximize();
		
//	3) Navigate to the application.
		driver.get("https://letcode.in/radio");
		
//	4) Select 'Yes' option from the first radio button.
	driver.findElement(By.id("yes")).click();
	
//	5) Verify 'Bar option' from 4th radio button is selected by default when a user loads this page.
	boolean findRadioButton = driver.findElement(By.id("notfoo")).isSelected();
	if(findRadioButton == true) {
		System.out.println(" Radio Button in bar 4 is selected");
	}
	else {
		System.out.println(" Radio button in bar 4 is not selected ");
	}
	
//	6) Verify 'Remember me' checkbox is selected by default when a user loads this page.
	boolean checkBoxRememberMe = driver.findElement(By.xpath("(//input[contains(@type,'checkbox')])[1]")).isSelected();
	if(checkBoxRememberMe == true) {
		System.out.println(" Check box Remember Me is selected");
	}
	else {
		System.out.println(" Check box Remember Me is not selected");
	}
//	7) Select 'T & C' checkbox.
	driver.findElement(By.xpath("(//input[contains(@type,'checkbox')])[2]")).click();
//	8) Close the browser.
	}
	

}
