package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDoubleClick {
	static {
		  System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	  }
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		WebElement src = driver.findElement(By.xpath("(//a[@id='navbarPages'])[2]"));
		Thread.sleep(2000);
        Actions a=new Actions(driver);
        a.moveToElement(src).perform();
        driver.findElement(By.partialLinkText("Customers")).click();
        WebElement click = driver.findElement(By.id("loginspan"));
        a.doubleClick(click).perform();
        String title = driver.getTitle();
        //System.out.println(title);
        if(title.equals("Login - Vtiger"))
          {
        	System.out.println("Login page is displayed");
        	}
        else
          {
        	System.out.println("Login page is not displayed");	
            } 
        	
	}
	}

