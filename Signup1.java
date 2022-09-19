package fg;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



	public class Signup1 {
@Test


	    public void signup() throws InterruptedException {
	            // TODO Auto-generated method stub
	             System.setProperty("webdriver.chrome.driver","C:/Users/revathi.d/Downloads/chromedriver_win32/chromedriver.exe");
	             WebDriver driver = new ChromeDriver();
	             driver.manage().window().maximize();
	             
	           //  driver.get("https://mobileworld.azurewebsites.net/");
	             landingpage landingpage2 = new landingpage(driver);
	             landingpage2.goTo();
	             Thread.sleep(1000);
	             landingpage2.signup1application("revathi","vignesh","revathi@123gmail.com","vignesh11" ,"04/19/2000","9765356721","Good girl");
	           
	     }
	}


