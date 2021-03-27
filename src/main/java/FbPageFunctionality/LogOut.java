package FbPageFunctionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.baseClass;

public class LogOut extends baseClass{
	
	public LogOut(WebDriver driver) {
		super(driver);
		
	}


	@FindBy(xpath="//div[4]/div[1]/span/div/div[1]/i")
	public WebElement Account;
	
	@FindBy(xpath="//div[4]/div/div[1]/div[2]/div/div/div/div/span")
    public WebElement logOut_btn;
	
	//Here the LogOut page is not taking further to any other page so return type is this page itself
	public LogOut logOut_Fb()
	{
		Account.click();
		logOut_btn.click();
		return this;
	}
	

}
