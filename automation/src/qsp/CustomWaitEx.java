package qsp;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWaitEx {
	static {
		  System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	  }
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.xpath("//div[text()='Login ']")).click();
        Thread.sleep(2000);
        int i=0;
        while(i<100)
        {
        	try {
        		driver.findElement(By.id("logoutLink")).click();
        		break;
        	}
        	catch(NoSuchElementException e)
        	{
        		i++;
        	}
        }
}
}