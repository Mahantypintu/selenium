package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHTMLCode {
	static {
		  System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	  }
	public static void main(String[] args) {
	  WebDriver driver=new ChromeDriver();	
      driver.get("https://www.google.com");
      String html=driver.getPageSource();
      System.out.println(html);
      driver.close();
	}

}
