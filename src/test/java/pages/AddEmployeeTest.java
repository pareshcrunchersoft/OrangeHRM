package pages;

import java.awt.List;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddEmployeeTest extends BaseTest{
	
	LoginPage loginPage;
	DashboardPage dashboardPage;
	EmployeeList employeeList;
	AddEmployee addEmployee;
	
	public AddEmployeeTest() throws InterruptedException
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws FileNotFoundException, InterruptedException
	{
		init();
		loginPage=new LoginPage();
		dashboardPage=loginPage.submit("Admin","admin123");
		employeeList=dashboardPage.clickEmployeeListLink();
		addEmployee=employeeList.clickAddEmployeeMenu();

	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	@Test
	public void verifyPageLoad()
	{
		String background=addEmployee.getbackground();
		System.out.println("backgroud is :"+background);
		//Assert.assertEquals(background, "#555657");
	}
	
	
//	@Test
//	public void verifyCreateLoginDetails() 
//	{
//		ArrayList<Boolean> actual=new ArrayList<Boolean>(4);
//		actual.add(addEmployee.isUsernameEnable());
//		actual.add(addEmployee.isPasswordEnable());
//		actual.add(addEmployee.isConfirmPasswordEnable());
//		actual.add(addEmployee.isStatusDDLEnable());
//		
//		ArrayList<Boolean> expected=new ArrayList<Boolean>(4);
//		Collections.fill(expected,true);
//		expected.add(true);
//		expected.add(true);
//		expected.add(true);
//		expected.add(true);
//		//Assert.assertEquals(actual, expected);
//		System.out.println(actual.size());
//		System.out.println(expected.size());
//		Assert.assertEquals(actual, expected);
//	}
	@Test
	public void verifyCreateLoginDetails() 
	{
		addEmployee.selectCheckLogin();
		
		ArrayList<Boolean> actual=new ArrayList<Boolean>(4);
		actual.add(addEmployee.isUsernameDisplayed());
		actual.add(addEmployee.isConfirmPasswordDisplayed());
		actual.add(addEmployee.isPasswordDisplayed());
		actual.add(addEmployee.isStatusDDLDisplayed());
		
		ArrayList<Boolean> expected=new ArrayList<Boolean>(4);
		Collections.fill(expected,true);
		expected.add(true);
		expected.add(true);
		expected.add(true);
		expected.add(true);
		//Assert.assertEquals(actual, expected);
		System.out.println(actual.size());
		System.out.println(expected.size());
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void verifyAddEmployee()
	{
		addEmployee.addEmployee("a", "b", "C:\\Users\\PS22750\\Pictures\\Saved Pictures\\Paresh Photo.jpg");
		
	}
}
