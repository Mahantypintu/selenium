package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioAllignFB {
	static {
		  System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	  }
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
		int g1 = driver.findElement(By.xpath("//input[@name='sex' and @value=1]")).getLocation().getY();
		int g2= driver.findElement(By.xpath("//input[@name='sex' and @value=2]")).getLocation().getY();
		int g3= driver.findElement(By.xpath("//input[@name='sex' and @value=-1]")).getLocation().getY();
	    if(g1==g2 && g2==g3)
	    	System.out.println("All radio button are alligned");
	    else
	    	System.out.println("All radio are not alligned");
	}
}
