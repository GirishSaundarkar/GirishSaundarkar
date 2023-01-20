package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice4 {

	public static void main(String[] args) {

		System.setProperty("driver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement element=driver.findElement(By.id("email"));
		element.sendKeys("gsaundarkar@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("97659334681");
		System.out.println(1);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
	}

}
