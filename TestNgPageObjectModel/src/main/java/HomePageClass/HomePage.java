package HomePageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;
import ContctPage.ContactPage;

public class HomePage extends BaseClass{
	
    public static WebDriver driver;	

	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contactBtn;
	
	@FindBy(xpath="//button[contains(text(),'New')]")
	WebElement NewBtn;
	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	WebElement HomeLink;
	
	
	@FindBy(xpath="//div[contains(text(),'Sujay Londhe')]")
	WebElement sujay_londhe; 
	
	public HomePage(){
		PageFactory.initElements(driver, this);
		
	
	}
	
	public Boolean HomeLink() {
	
	return HomeLink.isDisplayed();

		
		
	}
	
	public String titlepage()
	{
		
	return driver.getTitle();
	
		
	}
	
		
	public void sujay_londhe_link() {
		
	sujay_londhe.click();
	
	}
	}

	
	
		
	

