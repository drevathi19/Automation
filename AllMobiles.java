package fg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AllMobiles {
	@Test

	public void test() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/revathi.d/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		driver.findElement(By.xpath("//a[normalize-space()='All Mobiles']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" //input[@id='myInput']")).sendKeys("Samsung Galaxy Z");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Order")).click();
		

	}


	@Test

	public void test1() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:/Users/revathi.d/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		driver.findElement(By.xpath("//a[normalize-space()='All Mobiles']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" //input[@id='myInput']")).sendKeys("Samsung Galaxy A13");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Order")).click();
	}
}
		