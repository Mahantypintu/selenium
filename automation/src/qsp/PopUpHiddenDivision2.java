package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PopUpHiddenDivision2 {
	static {
		  System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	  }
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.id("dob")).click();
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s=new Select(month);
		s.selectByVisibleText("Apr");
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select y=new Select(year); 
		y.selectByValue("1999");
		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[22]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("alternative_number")).sendKeys("9876543210");
		Thread.sleep(2000);
		driver.findElement(By.id("renew_policy_submit")).click();
}
}
