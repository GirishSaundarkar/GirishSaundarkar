package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTestCases {

	@Test
public void VerifycurrentUrl() {
	System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/DELL/OneDrive/Desktop/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	String exp= "file:///C:/Users/DELL/OneDrive/Desktop/javabykiran-Selenium-Softwares/Offline%20Website/index.html";
	String act = driver.getCurrentUrl();
	driver.close();
	Assert.assertEquals(act, exp);
	
}
public void VerifyCurrentTitle() {
System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/DELL/OneDrive/Desktop/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
String exp = "javaByKiran  | Log in" ;
String act =driver.getTitle();
Assert.assertEquals(act, exp);
driver.close();
}
@Test
public void VerifyInstitudeSpeciality() {
	System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/DELL/OneDrive/Desktop/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
String exp = "JAVA | SELENIUM | PYTHON";
String act = driver.findElement(By.xpath("/html/body/div/div[1]/a/h4")).getText();
Assert.assertEquals(act, exp);
driver.close();
}
@Test
public void VerifySignIn() {
	System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/DELL/OneDrive/Desktop/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	driver.findElement(By.id("password")).sendKeys("123456");
	driver.findElement(By.xpath("/html body/div/[2]/form/div[3]/div/button")).click();
String exp = "javaByKiran | Dashboard";
String act = driver.getTitle();
driver.close();
Assert.assertEquals(act, exp);
}
@Test
public void VerifySignInError() {
	System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/DELL/OneDrive/Desktop/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	driver.findElement(By.id("email")).sendKeys("kiran1@gmail.com");//wrong emailid 
	driver.findElement(By.id("password")).sendKeys("1234567");// wrong password
	driver.findElement(By.xpath("/html body/div/[2]/form/div[3]/div/button")).click();
	String exp = "javaByKiran | Log in";// fails
	String act = driver.getTitle();
	driver.close();
	Assert.assertEquals(act, exp);
	}
public void verifyEmailError() {
	System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/DELL/OneDrive/Desktop/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	driver.findElement(By.id("email")).sendKeys("kiran1@gmail.com");//wrong emailid 
	driver.findElement(By.id("password")).sendKeys("1234567");// wrong password
	driver.findElement(By.xpath("/html body/div/[2]/form/div[3]/div/button")).click();
	String exp = "javaByKiran | Log in";// fails
	String act = driver.getTitle();
	driver.close();
	Assert.assertEquals(act, exp);
driver.quit();
}
}