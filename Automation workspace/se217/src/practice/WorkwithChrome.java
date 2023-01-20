package practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkwithChrome {


		ChromeDriver driver;
		
		String url = "https://qatechhub.com/";
		
		public void invokeBrowser() {
			
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get(url);
		}
		public void CloseBrowser() {
			
			driver.quit();
		}
		public static void main(String[] args) {
			
			WorkwithChrome wc = new WorkwithChrome();
			
			wc.invokeBrowser();
			
			wc.CloseBrowser();
		}
		
	}


