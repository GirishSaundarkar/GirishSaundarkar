package basic;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignIn {

	@Test
	public void SignInIdpass() {
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/DELL/OneDrive/Desktop/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
WebElement element=driver.findElement(By.id("email"));
element.sendKeys("kiran@gmail.com");	
driver.findElement(By.id("password")).sendKeys("123456");
driver.findElement(By.xpath("//*[@id=\"password\"]")).click();
	}
@Test
public void dashboard() {
System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/DELL/OneDrive/Desktop/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
driver.findElement(By.id("///html/body/div/aside/section/ul/li[2]/a")).click();
}
}