package basic;

import java.io.InterruptedIOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {

	public static void main(String[] args) throws InterruptedIOException, Throwable {

		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.id("email"));
        username.sendKeys("gsaundarkar@gmail.com");
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("97659334689");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
        WebElement Login = driver.findElement(By.id("u_0_v"));
        username.sendKeys("myusername@xyz.com");
        password.sendKeys("mypassword");
        Login.click();
        Thread.sleep(2000);
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement navigationclick = driver.findElement(By.id("logoutMenu"));
        WebElement logout = driver.findElement(By.xpath("//div[@id='u_d_1']/div/div/div/div/div/ul/li[12]/a/span/span"));
        navigationclick.click();
        if(logout.isEnabled() && logout.isDisplayed()) {
            logout.click();
        }
        else {
            System.out.println("Element not found");
	}

	}}
