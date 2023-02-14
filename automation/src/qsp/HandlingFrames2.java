package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames2 {
	static {
		  System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	  }
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/91845/Desktop/page1.html");
        driver.findElement(By.id("t1")).sendKeys("a");
        // attribute as arguments
        driver.switchTo().frame("f1");
        driver.findElement(By.id("t2")).sendKeys("b");
        driver.switchTo().defaultContent();
        driver.findElement(By.id("t1")).sendKeys("c");
        //ref of web element as arguments. so we have to find the element
        WebElement f = driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(f);
        driver.findElement(By.id("t2")).sendKeys("d");
}
}