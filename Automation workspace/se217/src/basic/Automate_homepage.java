package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automate_homepage {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redberyltech.com");
		WebElement element=driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[1]/div/div/h6/a[2]"));
		element.click();
		driver.findElement(By.xpath("/html/body/footer/div/div/div/div/div[2]/ul/li[1]/a")).click();//1
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]/div/div/h6/a[2]")).click();
driver.findElement(By.xpath("/html/body/footer/div/div/div/div/div[2]/ul/li[1]/a")).click();
driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[3]/div/div/h6/a[2]")).click();
driver.findElement(By.xpath("/html/body/footer/div/div/div/div/div[2]/ul/li[1]/a")).click();
driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[3]/div/div/h6/a[2]")).click();
driver.findElement(By.xpath("/html/body/footer/div/div/div/div/div[2]/ul/li[1]/a")).click(); // home
driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[4]/div/div/h6/a[2]")).click();
driver.findElement(By.xpath("/html/body/footer/div/div/div/div/div[2]/ul/li[1]/a")).click();
System.out.println();
driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[5]/div/div/h6/a[2]")).click();
System.out.println();
driver.findElement(By.xpath("/html/body/footer/div/div/div/div/div[2]/ul/li[1]/a")).click();
driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[6]/div/div/h6/a[2]")).click();
driver.findElement(By.xpath("/html/body/footer/div/div/div/div/div[2]/ul/li[1]/a")).click();
driver.findElement(By.xpath("//*[@id=\"Riyaqas_main_menu\"]/ul/li[5]/a")).click();
driver.findElement(By.name("name")).sendKeys("Girish");
driver.findElement(By.name("email")).sendKeys("gsaundarkar@gmail.com");
WebElement testDropDown = driver.findElement(By.id("testingDropdown"));  
Select dropdown = new Select(testDropDown); 
dropdown.selectByVisibleText("Cloud technology Solution");
driver.findElement(By.xpath("//*[@id=\"my_captcha_form\"]/div/div[4]/div/textarea")).sendKeys("girish Saundarkar");
		
	driver.findElement(By.xpath("//*[@id=\"my_captcha_form\"]/div/div[6]/button")).click();
	}

}
