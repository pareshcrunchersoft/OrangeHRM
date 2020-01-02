package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.EventListener;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.WebEventListener;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver=null;
	//WebEventListener 
	public static WebEventListener listener;
	public static WebDriverWait wait=null;
	public static String current_path=System.getProperty("user.dir");
	public static Logger logger=null;
	
	static {
		PropertyConfigurator.configure(current_path+"\\src\\main\\resources\\config\\log4j.properties");
	}
	
	public BaseTest()
	{
		System.out.println("project path: "+ current_path);
		FileInputStream fis=null;
		logger=Logger.getLogger(BaseTest.class);
		prop=new Properties();
		try {
			fis = new FileInputStream(current_path+"\\src\\main\\resources\\config\\BrowserConfig.properties");
			System.out.println("path is: "+current_path+"\\src\\main\\resources\\config\\BrowserConfig.properties");
			prop.load(fis);
		} 
		
		catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void init() throws FileNotFoundException
	{
		String Bname=prop.getProperty("browser");
		
		if(Bname.equals("chrome"))
		{
			System.out.println("use chrome setting");
		}
		else if(Bname.equals("ff"))
	     {
			//System.setProperty("webdriver.firefox.bin",prop.getProperty("firefoxPath"));
			//System.setProperty("webdriver.firefox.bin","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
			
			//DesiredCapabilities cap= DesiredCapabilities.firefox();
			///cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			//driver=new FirefoxDriver(cap);
			System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
			FirefoxProfile prof= new FirefoxProfile();
			prof.setPreference("browser.startup.homepage", "about:blank");
			prof.setPreference("startup.homepage_welcome_url", "about:blank");
			prof.setPreference("startup.homepage_welcome_url.additional", "about:blank");
			//prof.setAcceptUntrustedCertificates(true);
			//prof.setAssumeUntrustedCertificateIssuer(true);
			
			
			
			
			driver=new FirefoxDriver(prof);
	     }
		
		 listener = new WebEventListener();
		EventFiringWebDriver e_driver= new EventFiringWebDriver(driver);
		e_driver.register(listener);
		driver=e_driver;
		
	
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get(prop.getProperty("url"));
	}
	
	
}
