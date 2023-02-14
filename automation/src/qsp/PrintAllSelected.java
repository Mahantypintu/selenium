package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllSelected {
	static {
		  System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	  }
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/91845/Desktop/MultipleListBox.html");
		WebElement cpListBox = driver.findElement(By.id("cp"));
		Select s=new Select(cpListBox);
		List<WebElement> cplist = s.getAllSelectedOptions();
		int count=cplist.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
		  String alltext = cplist.get(i).getText();
		  System.out.println(alltext);
		  }
		}
}
