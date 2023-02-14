package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {
		static {
			  System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
		  }
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/91845/Desktop/Htmllocators.html");
			driver.findElement(By.linkText("Google")).click();
			driver.navigate().back();
			driver.findElement(By.partialLinkText("Go")).click();
	}

}
