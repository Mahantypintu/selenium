package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintText2 {
	static {
		  System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	  }
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		String tag = driver.findElement(By.xpath("//a[text()='Forgot your password?']")).getText();
		String att = driver.findElement(By.xpath("//a[@href='javascript: void(0)']")).getText();
		System.out.println(att);
		System.out.println(tag);
		driver.close();
	}
	
}
