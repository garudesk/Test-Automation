package LoginPageClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;
import HomePageClass.HomePage;

public class LoginPage extends BaseClass {
	
	
	
	//Page Factory----
	
	@FindBy(xpath="//input[@id='email']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement password;
	
	
	@FindBy(xpath="//input[@id='u_0_a']")
	WebElement submit;

	
	
	
	//Initializing the Page Objects:
		public LoginPage(){
			PageFactory.initElements(driver, this);
			
		}
	
	
		public void login() throws InterruptedException{
			Thread.sleep(5000);
			username.sendKeys("7387427077");
			password.sendKeys("Suhas8020");
			//loginBtn.click();
			    	JavascriptExecutor js = (JavascriptExecutor)driver;
			    	js.executeScript("arguments[0].click();", submit);
			    	
			//return new HomePage();///return the Landing Page Object reference that's why return word used.
	
	
}
}