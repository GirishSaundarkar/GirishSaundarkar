package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice7 {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.driver.chrome", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement element=driver.findElement(By.name("q"));
		driver.findElement(By.name("q")).sendKeys("girish saundarkar");
		System.out.println(1);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		System.out.println(2);
		driver.close();
		
		
	}

}
