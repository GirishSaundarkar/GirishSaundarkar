package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class six {

	public static void main(String[] args) {

		System.out.println(1);
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.out.println(2);
		WebDriver driver=new ChromeDriver();
		System.out.println(3);
		driver.get("file:///C:/Users/DELL/OneDrive/Desktop/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		System.out.println(4);
	}

}
