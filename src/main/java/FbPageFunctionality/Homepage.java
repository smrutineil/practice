package FbPageFunctionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.baseClass;

public class Homepage extends baseClass {
	
	//As Homepage is extends baseClass and baseclass has a constructor it need to implement super class
	public Homepage(WebDriver driver) {
		super(driver);
	}



	@FindBy(id="email")
	public WebElement uName;
	
	@FindBy(id="pass")
	public WebElement pass;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")
	public WebElement logInBtn;
	
	
	//doLogIn is taking to Landingpage so it's return type should have taht same page itself(LandingPage)
	public LandingPage doLogIn(String username,String password)
	{
		
		
		uName.sendKeys(username);
		pass.sendKeys(password);
		logInBtn.click();
		return new LandingPage(driver);
	}
	

}
