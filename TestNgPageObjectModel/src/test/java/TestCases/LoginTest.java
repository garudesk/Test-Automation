package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import HomePageClass.HomePage;
import LoginPageClass.LoginPage;

public class LoginTest extends BaseClass{
	
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginTest(){
		super();
	}
	
	@Test
	public void setUp() throws InterruptedException{
		initialization();
		loginPage = new LoginPage();
		loginPage.login();
	}
	
	
	

	
	
	
}
