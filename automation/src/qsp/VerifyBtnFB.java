package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyBtnFB {
	static {
		  System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	  }
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
        boolean btn = driver.findElement(By.name("login")).isEnabled();
        if(btn==true)
        {
        	System.out.println("Button is enabled");
        }
        else
        {
        	System.out.println("Button is not enabled");
        }
        driver.close();
	}
}
