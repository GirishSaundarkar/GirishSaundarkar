package basic;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class abcerror {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.redberyltech.com/");// link
	    WebElement element=driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[1]/div/div/h6/a[2]"));// first element
	    element.click();
	  driver.findElement(By.xpath("/html/body/footer/div/div/div/div/div[2]/ul/li[1]/a")).click();//home
	  driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]/div/div/h6/a[2]")).click();//2nd
	  driver.findElement(By.xpath("/html/body/footer/div/div/div/div/div[2]/ul/li[1]/a")).click();//home
	  driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[3]/div/div/h6/a[2]")).click();//3rd
	  driver.findElement(By.xpath("/html/body/footer/div/div/div/div/div[2]/ul/li[1]/a")).click();//home
	  driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[4]/div/div/h6/a[2]")).click();//4th 
	  driver.findElement(By.xpath("/html/body/footer/div/div/div/div/div[2]/ul/li[1]/a")).click();//home
	  driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[5]/div/div/h6/a[2]")).click();//5th
	  driver.findElement(By.xpath("/html/body/div/footer/div/div/div/div/div[2]/ul/li[1]/a")).click();//home
	  driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[6]/div/div/h6/a[2]")).click();//6th
	  driver.findElement(By.xpath("/html/body/div/footer/div/div/div/div/div[2]/ul/li[1]/a")).click();//home
	  driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[5]/a")).click();
	  driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/form/div/div[1]/div/input")).sendKeys("girish saundarkar");
	  driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/form/div/div[2]/div/input")).sendKeys("gsaundarkar@gmail.com");
	    WebElement drpCountryEle=driver.findElement(By.name("service"));
	    Select drpCountry=new Select(drpCountryEle);
	    drpCountry.selectByValue("Cloud Technology Solutions");
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/form/div/div[4]/div/textarea")).sendKeys("my name is girish saundarkar i am from yavatmal my i have done my schooling from maharishi vidya mandir yavatmal and graduation from jagdambha college of engineering and technology when i was in college i had made my mind to become a software tester i have done certification from java by kiran institute pune as a fresher i dont have work experience but i am very passionate to work for this company");
	    driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/div/span/div[1]")).click();

	}

}
