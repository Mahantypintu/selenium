package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks {
	static {
		  System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	  }
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        // count all the links in number
        int count=allLinks.size();
        System.out.println(count);
        // print all the links with their name
        for(int i=0;i<count;i++)
        {
        	WebElement link = allLinks.get(i); //access link
        	String text = link.getText();  // print the text of link
        	System.out.println(text);
        }
	}

}
