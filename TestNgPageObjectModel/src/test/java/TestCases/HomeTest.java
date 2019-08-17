package TestCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import HomePageClass.HomePage;
import LoginPageClass.LoginPage;

public class HomeTest extends BaseClass {
	
	LoginPage loginPage;
	HomePage homepage;

	
	public HomeTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		initialization();
		loginPage = new LoginPage();
		loginPage.login();
	}
	
	@Test(priority = 1)
	
	public void titletest()
	{
	
	String titlepage = homepage.titlepage();
	Assert.assertEquals(titlepage, "google", "Wrong title");
	
	}
//	@Test(priority = 2)
//	public void HomeActionHomeLink()
//	{
//  	
//	homepage = new HomePage();
//	
//	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
//	
//	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//	
//    homepage.HomeLink();
//    
//    Assert.assertTrue(true);
//	}
//	
//    @Test(priority = 3)
//    
//    public void sujay_londhe_link_test()
//    {
//    
//    homepage.sujay_londhe_link();
//    
//    }
}

	
