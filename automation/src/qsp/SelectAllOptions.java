package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllOptions {
	static {
		  System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	  }
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/91845/Desktop/MultipleListBox.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		List<WebElement> alloptions = s.getOptions();
		int count=alloptions.size();
		System.out.println(count);
		// select all options
		for(int i=0;i<count;i++)
		{
		  Thread.sleep(2000);
		  s.selectByIndex(i);
		  }
		// de-select all options in reverse
		for(int i=count-1;i>=0;i--)
		{
			Thread.sleep(2000);
			s.deselectByIndex(i);
		}
		}
}
