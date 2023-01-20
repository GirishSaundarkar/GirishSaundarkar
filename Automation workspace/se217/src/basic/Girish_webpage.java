package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Girish_webpage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		System.out.println(1);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement element=driver.findElement(By.name("q"));
		element.sendKeys("bulb");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
	    ((WebElement) driver.findElements(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button/svg"))).click();
		driver.close();

	}

}
