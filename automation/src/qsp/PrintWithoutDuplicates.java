package qsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintWithoutDuplicates {
	static {
		  System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	  }
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		HashSet<String> hs=new HashSet<String>();
		driver.get("file:///C:/Users/91845/Desktop/MultipleListBox.html");
        WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		List<WebElement> all = s.getOptions();
		int count=all.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text = all.get(i).getText();
			hs.add(text);
		}
		for(String opt:hs)
		{
			System.out.println(opt);
		}
		driver.close();
}
}