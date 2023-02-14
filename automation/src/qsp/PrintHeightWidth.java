package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// height and width of login button of FB
public class PrintHeightWidth {
	static {
		  System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	  }
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement lgBtn = driver.findElement(By.name("login"));
        int height=lgBtn.getSize().getHeight();
        int width=lgBtn.getSize().getWidth();
        System.out.println("height is"+height);
        System.out.println("width is"+width);
        driver.close();
	}

}
