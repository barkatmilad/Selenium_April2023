package frameDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) {
//	1) open a browser
		ChromeDriver driver = new ChromeDriver();
		
//	2) Maximize it
		driver.manage().window().maximize();
		
//	3) Navigate to application
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
//	5) Go inside the frame that contains DEPRECTED hyperlink
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");
		
		
//	5) Click DEPRECATED hyperlink
		driver.findElement(By.linkText("INDEX")).click();
//		Why I can not click on 'USE', 'PACKAGE', 'CLASS' hyperlinks in the frame?
//		6) come out of existing frame
		driver.switchTo().defaultContent();
//		7) go inside the secound frame
		driver.switchTo().frame("packageFrame");
//		8) click on Action.
		driver.findElement(By.linkText("Action")).click();
		
	}

}
