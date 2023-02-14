package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpFileUpload {
	static {
		  System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	  }
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/91845/Desktop/resume.html");
		Thread.sleep(2000);
		File f=new File("./data/PINTU MAHANTY Resume.docx");
		String abpath=f.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys(abpath);
	}
}
