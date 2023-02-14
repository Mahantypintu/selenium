package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBCLatestNews {
	static {
		  System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	  }
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/");
		List<WebElement> news = driver.findElements(By.xpath("(//div[@class='top-list'])[1]/ul/li/a/h3"));
		int newslist=news.size();
		for(int i=0;i<newslist;i++)
		{
			System.out.println(news.get(i).getText());
		}
	}
}
