package pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


@Ignore
public class LoginPageTest extends BaseTest{
	
	public LoginPage loginpage;
	public DashboardPage dashboardpage;
	
	public LoginPageTest()
	{
		super();
	}

	
	@BeforeMethod
	public void setup() throws FileNotFoundException
	{
		init();
		loginpage= new LoginPage();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test(priority=2)
	public void validatePageLoad()
	{
		boolean flag=loginpage.verifyPageLoaded();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=1)
	public void getTitle()
	{
		System.out.println(loginpage.getPageURL());
	}
	
	
//	public void loginTest()
//	{
//		dashboardpage= loginpage.submit(prop.get("username").toString(), prop.get("password").toString());
//	}

	
	@Test(dataProvider="loginDetails")
	public void loginTest(String uname, String pwd, String expected)
	{
		 loginpage.submit(uname,pwd);
		 String msg=loginpage.verifyErrorMsg();
		// Assert.assertEquals(msg, expected);
		 verifyMsg(msg,expected);
		 System.out.println(msg);
	}

	
	@Test(dependsOnMethods="loginTest")
	public void verifyMsg(String msg,String expected){
		
		Assert.assertEquals(msg, expected);

	}
	
	@DataProvider(name="loginDetails")
	public Object[][] loginDetailsDataProvider()
	{
		return new Object[][]{{"admin","admin","Invalid credentials"},
							  {"Admin","admin123",""},
							  {"","admin123","Username cannot be empty"},
							  {"admin","","Password cannot be empty"},
							  {"","","Username cannot be empty"}
								};
	}
}
