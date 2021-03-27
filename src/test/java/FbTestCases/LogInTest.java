package FbTestCases;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import FbPageFunctionality.Homepage;
import FbPageFunctionality.LandingPage;
import FbPageFunctionality.LogOut;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LogInTest {
	
	WebDriver driver;
	@Test
	public void logIn_Test()
	{
		Map<String,Object> prefs =new HashMap<String,Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		
		ChromeOptions option=new ChromeOptions();
		option.setExperimentalOption("prefs", prefs);
		option.addArguments("--disable-extensions--");
		option.addArguments("--disable-infobars--");
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(option);
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L,TimeUnit.SECONDS);
		
		//if instead of initializing the page(pageintelement) with the object(home), 
		//ll be done directely then, Homepage home=PageFactory.initElements(driver, Homepage.class);
      /*
		Homepage home=new Homepage(driver);
		home.doLogIn("ssmruti.123@gmail.com", "Ffacebook@4321");
		
		LandingPage lp= new LandingPage(driver);
		lp.RandomClick();
		lp.logOut();
	 */
		/*Method chaining concept
		here in single line if RandomClick(LandingPage) fails whole functionality will break down. 
	    new Homepage(driver).doLogIn("ssmruti.123@gmail.com", "Ffacebook@4321").RandomClick().logOut();
	  */	
		Homepage home= new Homepage(driver);
		//doLogIn is returning LandingPage
		LandingPage lp=home.doLogIn("ssmruti.123@gmail.com", "Ffacebook@4321");
		LogOut close= lp.RandomClick();
		close.logOut_Fb();
		
		
	}

}
