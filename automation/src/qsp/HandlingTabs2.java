package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabs2 {
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
        driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
        driver.findElement(By.xpath("//a[text()='About your actiTIME']")).click();
        driver.findElement(By.partialLinkText("Read Service ")).click();
        Thread.sleep(2000);
        String pwh = driver.getWindowHandle();
        List<WebElement> heading = driver.findElements(By.xpath("//h2"));
        for(WebElement head:heading)
        {
        	String text = head.getText();
        	System.out.println(text);
        	Thread.sleep(2000);
            driver.close();
        }
        
        System.out.println("closing parent browser");
        driver.switchTo().window(pwh);
        driver.close();
	}
}
