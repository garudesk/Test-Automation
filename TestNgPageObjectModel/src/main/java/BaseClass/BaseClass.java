package BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass 

{
	
	 public static WebDriver driver;
	 public static Properties prop;
	//public  static EventFiringWebDriver e_driver;
	//public static WebEventListener eventListener;
	

	 public BaseClass()
	 {
	 
	 
		try {
			Properties prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Eclips instalation setup\\PageObjectModel\\src\\main\\java\\Config_properties\\Properties.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	 }
	
	public static void initialization()
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kanchan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
     	driver = new ChromeDriver(); 
     	
     	driver.get("https://www.facebook.com/");
     	
     	driver.manage().window().maximize();
     	
	}	
	}	
 		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String browserName = prop.getProperty("browser");
//		
//		
//		if(browserName.equals("chrome")){
//	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kanchan\\Downloads\\chromedriver_win32\\chromedriver.exe");	
//			driver = new ChromeDriver(); 
//		}
//		else if(browserName.equals("FF")){
//			System.setProperty("webdriver.gecko.driver", "/Users/naveenkhunteta/Documents/SeleniumServer/geckodriver");	
//			driver = new FirefoxDriver(); 
//		}
//		
//		
//		//e_driver = new EventFiringWebDriver(driver);
//		// Now create object of EventListerHandler to register it with EventFiringWebDriver
//		//eventListener = new WebEventListener();
//		//e_driver.register(eventListener);
//		//driver = e_driver;
//		
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		//driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
//		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
//		
//		driver.get(prop.getProperty("url"));
//		
//	}
	
	
