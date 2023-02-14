package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptionsWithoutLoop {
	static {
		  System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	  }
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/91845/Desktop/MultipleListBox.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		String text = s.getWrappedElement().getText();
		System.out.println(text);
}	
}
