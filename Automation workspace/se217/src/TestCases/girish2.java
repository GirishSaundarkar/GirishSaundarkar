package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class girish2 {
WebDriver driver ;
@Test
public void f() {
	
	String baseUrl = "http://www.toolsqa.com/";
	
	System.out.println("launching Google Chrome browser");
	driver = new ChromeDriver();
	driver.get(baseUrl);
	String testTitle = "Free QAAutomation Tools For Everyone";
	String OriginalTitle = driver.getTitle();
	Assert.assertEquals(OriginalTitle, testTitle);
}

@BeforeMethod
public void beforeMethod() {
	System.out.println("starting test on chrome Browser");
}

@AfterMethod
public void afterMethod() {
	driver.close();
	System.out.println("Finished Test on Chrome browser");
}
}
