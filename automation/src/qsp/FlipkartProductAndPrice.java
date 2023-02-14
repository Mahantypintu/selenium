package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartProductAndPrice {
	static {
		  System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	  }
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button)[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("iphone 14 pro max");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		List<WebElement> product = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone')]"));
		Thread.sleep(2000);
		List<WebElement> price = driver.findElements(By.xpath("//div[@class=\"_30jeq3 _1_WHN1\"]"));
		int products=product.size();
		int prices=price.size();
		for(int i=0;i<products;i++)
		{
			System.out.println(product.get(i).getText()+"--->"+price.get(i).getText());
		}
	}
}
