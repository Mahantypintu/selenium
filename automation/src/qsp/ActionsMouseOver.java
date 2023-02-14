package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMouseOver {
	static {
		  System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	  }
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.vtiger.com/");
        WebElement src = driver.findElement(By.xpath("(//a[@id='navbarPages'])[2]"));
        Actions a=new Actions(driver);
        a.moveToElement(src).perform();
        driver.findElement(By.partialLinkText("Contact Us")).click();
        String phn = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/../p[2]")).getText();
        System.out.println(phn);
	}

}

