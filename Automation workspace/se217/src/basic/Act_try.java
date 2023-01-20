package basic;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Act_try {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/DELL/OneDrive/Desktop/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
Actions builder=new Actions(driver); 
Action contextclick=builder.contextClick(driver.findElement(By.id("email"))).build();
	
	contextclick.perform();
	}

}
