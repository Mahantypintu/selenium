package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {
	static {
		  System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	  }
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/91845/Desktop/xpath.html");
		// absolute path
		driver.findElement(By.xpath("/html/body/a")).click();
		driver.navigate().back();
		// by attribute
		driver.findElement(By.xpath("//input[@type='text']"));
		driver.navigate().back();
		// by text()
		driver.findElement(By.xpath("//p[text()='pintu']"));
		driver.navigate().back();
		// by contains()
		driver.findElement(By.xpath("//p[contains(text(),'poo')]"));
		driver.navigate().back();
		// by traversing path
		driver.findElement(By.xpath("//td[text()='selenium']/../td[1]"));
		//by independent-dependent 
		driver.findElement(By.xpath("//td[text()='selenium']/../td[2]"));
		//by group index
		driver.findElement(By.xpath("(//td[text()='selenium'])[2]/../td[2]"));
		
	}
}
