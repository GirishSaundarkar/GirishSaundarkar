package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("www.flipkart.com");
	
			WebElement element=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
	
					driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button/svg")).click();
	}

}
