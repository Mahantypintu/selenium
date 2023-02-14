package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopUpNotification {
	static {
		  System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	  }
	public static void main(String[] args) {
		//change the settings by applying option class
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		//after open the browser by passing reference
		WebDriver driver=new ChromeDriver(option);
        driver.get("https://www.yatra.com/");
	}

}
