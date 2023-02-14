package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAlignment {
	static {
		  System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	  }
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
        int x=driver.findElement(By.id("username")).getLocation().getX();
        int y=driver.findElement(By.name("pwd")).getLocation().getX();
        if(x==y)
        	System.out.println("Both are properly aligned");
        else
        	System.out.println("Both are not properly aligned");
        driver.close();
	}

}
