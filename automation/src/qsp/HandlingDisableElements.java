package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisableElements {
	static {
		  System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	  }
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/91845/Desktop/disable.html");
		driver.findElement(By.id("d1")).sendKeys("admin");
		//down casting to get JSExecutor methods
		JavascriptExecutor r=(JavascriptExecutor) driver;
		//js code in pw text field to handle disabled element
		r.executeScript("document.getElementById('d2').value='manager'");
	}
}
