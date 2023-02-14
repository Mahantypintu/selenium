package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAxis {
	static {
		  System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	  }
	public static void main(String[] args) {
	  WebDriver driver=new ChromeDriver();
      driver.get("https://www.facebook.com/");
      WebElement lgBtn = driver.findElement(By.name("login"));
      int x=lgBtn.getLocation().getX();
      int y=lgBtn.getLocation().getY();
      System.out.println(x);
      System.out.println(y);
}
}
