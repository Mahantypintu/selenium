package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyCheckBox {
	static {
		  System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	  }
	
    public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		boolean check = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		if(check==true)
			System.out.println("Checkbox is selected");
		else
			System.out.println("Checkbox is not selected");
		driver.close();
	}
}
