package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/DELL/OneDrive/Desktop/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	
		WebElement element=driver.findElement(By.id("email"));
	
		element.sendKeys("kiran@gmail.com");
	
		driver.findElement(By.id("password")).sendKeys("123456");
	
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	}
}
