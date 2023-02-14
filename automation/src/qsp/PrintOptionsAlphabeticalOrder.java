package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOptionsAlphabeticalOrder {
	static {
		  System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	  }
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/91845/Desktop/MultipleListBox.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		List<WebElement> alloptions = s.getOptions();
		for(int i=0;i<alloptions.size();i++)
		{
		  String text = alloptions.get(i).getText();
		  al.add(text);
        }
		Collections.sort(al);
		for(String opt:al)
		{
			System.out.println(opt);
		}
}
}