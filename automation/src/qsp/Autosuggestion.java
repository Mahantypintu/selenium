package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {
	static {
		  System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	  }
	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.google.com/");
	 // type the content
	 driver.findElement(By.name("q")).sendKeys("java"); 
	 Thread.sleep(3000);
	 //collect all the suggestion
	 List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
	 // count all suggestion
	 int count=allsugg.size();
	 System.out.println(count);
	 // print text of all suggestion
	 for(int i=0;i<count;i++)
	 {
		 String text = allsugg.get(i).getText();
		 System.out.println(text);
	 }
	}

}
