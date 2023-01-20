package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice8 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		WebElement element=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		element.sendKeys("girish Saundarkar");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]")).click();
	}

}
