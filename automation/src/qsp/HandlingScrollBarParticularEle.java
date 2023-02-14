package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBarParticularEle {
	static {
		  System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	  }
	public static void main(String[] args) {
		WebDriver  driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		//before scrolling to particular element, first find out location of that element
        int y = driver.findElement(By.xpath("//span[text()='Future Planet']")).getLocation().getY();
        JavascriptExecutor j=(JavascriptExecutor) driver;
        // concatenation y to js code
        j.executeScript("window.scrollBy(0,"+y+")");
}
}