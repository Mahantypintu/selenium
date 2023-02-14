package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListBox {
	static {
		  System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	  }
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/91845/Desktop/MultipleListBox.html");
		WebElement multiListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(multiListBox);
		Thread.sleep(3000);
		s.selectByIndex(0);
		Thread.sleep(3000);
		s.selectByValue("l");
		Thread.sleep(3000);
		s.selectByVisibleText("poori");
		Thread.sleep(3000);
		s.deselectByIndex(0);
		Thread.sleep(3000);
		s.deselectByValue("l");
		Thread.sleep(3000);
		s.deselectByVisibleText("poori");
		Thread.sleep(3000);
		boolean sel = s.isMultiple();
		System.out.println(sel);
	}
}
