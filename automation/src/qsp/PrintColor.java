package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// print css properties of forgotten pwd link in fb page
public class PrintColor {
	static {
		  System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	  }
	public static void main(String[] args) {
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/");
       String color = driver.findElement(By.linkText("Forgotten password?")).getCssValue("color");
       String fsize = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-size");
       String ftype = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-family");
       System.out.println(color);
       System.out.println(fsize);
       System.out.println(ftype);
	}

}
