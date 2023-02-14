package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightWidthTextField {
	static {
		  System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	  }
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
      driver.get("https://demo.actitime.com/");
      WebElement email = driver.findElement(By.id("username"));
      int h1=email.getSize().getHeight();
      //System.out.println(h1);
      int w1=email.getSize().getWidth();
      //System.out.println(w1);
      WebElement pwd = driver.findElement(By.name("pwd"));
      int h2=pwd.getSize().getHeight();
      //System.out.println(h2);
      int w2=pwd.getSize().getWidth();
      //System.out.println(w2);
      if(h1==h2 && w1==w2)
      {
    	  System.out.println("Both have same height and width");
      }
      else {
    	  System.out.println("Both have not same height and width");
      }
      
}
}