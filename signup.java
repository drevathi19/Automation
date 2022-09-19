package fg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class signup {
     @Test
	public void test() throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:/Users/revathi.d/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		Thread.sleep(1000);
		driver.findElement(By.className("my-2")).click();
		driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#myName")).sendKeys("Revathi");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("vignesh");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[placeholder='Enter Email']")).sendKeys("revathi@123");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("vignesh11");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("04/19/2000");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div[class='col-md-3'] input[name='gender']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[placeholder='91XXXXXXXXXX']")).sendKeys("9765356721");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("textarea[placeholder='Short Bio']")).sendKeys("Good girl");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Register']")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("btn")).click();
		
		
		
	}

}

