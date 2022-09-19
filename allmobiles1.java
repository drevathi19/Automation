package fg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;





public class allmobiles1 {

@Test



   public void allmobiles()throws InterruptedException {
         
       System.setProperty("webdriver.chrome.driver","C:/Users/revathi.d/Downloads/chromedriver_win32/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
             
           
       landingpage landingpage3 = new landingpage(driver);
       landingpage3.goTo();
       Thread.sleep(1000);
       landingpage3.allmobiles1application("Samsung Galaxy Z");
     }
}




















