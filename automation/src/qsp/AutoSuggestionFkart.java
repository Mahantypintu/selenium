package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionFkart {
	static {
		  System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	  }
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		// type the content
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 14 pro max");
		//collect all the suggestion
		List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(text(),'iphone 14 pro max')]"));
		// count all suggestion
		int count=allsugg.size();
		System.out.println(count);
		// print text of all suggestion
		for(int i=0;i<count;i++)
		{
			 String text = allsugg.get(i).getText();
			 System.out.println(text);
		}
		allsugg.get(count-1).click();
		}
}


