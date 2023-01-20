package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_browserTest {

	public static void main(String[] args) {

		System.out.println(1);
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.out.println(2);
		ChromeDriver driver = new ChromeDriver();
		System.out.println(3);
	   driver.get("file:///E:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	   System.out.println(4);
	   WebElement element=driver.findElement(By.id("email"));
	   element.sendKeys("kiran@gmail.com");
	   driver.findElement(By.id("password")).sendKeys("123456");
	   driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	}
}
