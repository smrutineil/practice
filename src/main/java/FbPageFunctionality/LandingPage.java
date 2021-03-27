package FbPageFunctionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.baseClass;

public class LandingPage extends baseClass{
	
	public LandingPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//div[4]/div[1]/span/div/div[1]/i")
	public WebElement Account;
	
	@FindBy(xpath="//div[1]/div[1]/div/div/div/div/div/div/div/div[1]/div/div[1]/a/div[1]/div[2]/div/div/div")
	public WebElement Profile;
	
	@FindBy(xpath="//div[3]/div/div/div/div[2]/div/div/div/div[1]/div/div/div[1]/div[2]/span/span")
	public WebElement EditProfile;
	
	@FindBy(xpath="//div[2]/div/div/div/div[2]/div/i")
	public WebElement close;
	
	
	
	
	//randomClick method is responsible to take to LogOut page so its return type will be LogOut page 
	public LogOut RandomClick()
	{
		Account.click();
		Profile.click();
		EditProfile.click();
		close.click();
		return new LogOut(driver);
		
	}
	
}
