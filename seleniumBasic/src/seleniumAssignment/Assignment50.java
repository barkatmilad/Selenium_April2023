package seleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment50 {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		driver.findElement(By.name("first_name")).sendKeys(" Barkat");
		driver.findElement(By.name("last_name")).sendKeys("Azizi");
		driver.findElement(By.name("business_name")).sendKeys("Milad");
		driver.findElement(By.name("email")).sendKeys("barkatyawari@yahoo.com");
		String numb1 = driver.findElement(By.id("numb1")).getText();
		String numb2 = driver.findElement(By.id("numb2")).getText();
//		convert numb1 and numb1 from String value to integer value.
		int num1= Integer.parseInt(numb1);
		int num2= Integer.parseInt(numb2);
//		for writing the sum of num1 and num2 as a result we should change integer to String.
		int sum = (num1+ num2);
		String total = String.valueOf(sum);
		driver.findElement(By.id("number")).sendKeys(total);
		driver.findElement(By.id("demo")).click();
		
		
		
		
		
		System.out.println(num1 + num2);
		
		
	}

}
