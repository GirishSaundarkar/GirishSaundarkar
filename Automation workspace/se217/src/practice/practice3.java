package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.out.println(1);
		WebDriver driver=new ChromeDriver();
		System.out.println(2);
		driver.get("https://www.facebook.com.com");
		System.out.println(3);
		WebElement element=driver.findElement(By.id("email"));
		System.out.println(4);
		element.sendKeys("gsaundarkar@gmail.com");
		System.out.println(5);
		driver.findElement(By.id("pass")).sendKeys("97659334681");
		System.out.println(6);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
System.out.println(7);	

		
		
		
	}
}
