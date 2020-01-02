package pages;

import java.awt.List;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import utils.ReadExcelFile;
@Ignore
public class EmployeeListTest extends BaseTest {
	
	public LoginPage loginPage;
	public EmployeeList employeeList;
	public DashboardPage dashboradPage;
	
	public EmployeeListTest() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	@BeforeMethod
	public void setUp() throws FileNotFoundException, InterruptedException {
		init();
		loginPage=new LoginPage();
		dashboradPage=loginPage.submit("Admin", "admin123");
		employeeList=dashboradPage.clickEmployeeListLink();
	}

	
	@Test@Ignore
	public void verifyEmployeeList()
	{
		employeeList.clickSearchBtn("John");
		employeeList.getEnames();
	}
	
	@Test@Ignore
	public void verifyEmployeeRowList()
	{
		employeeList.clickSearchBtn("");
		employeeList.getEmployeeRow();
	}
	
//	@Test
//	public void verifyEmpListByExcel() throws IOException
//	{
//		ReadExcelFile.getData();
//		
//	}
//	
	
	@Test
	public void verifyEmpListByExcel() throws IOException
	{
		employeeList.clickSearchBtn("Thomas");
		ArrayList<ArrayList<String>> list=employeeList.getEmployeeRow();
		Object[][] obj=ReadExcelFile.getData("EmployeeListData",0);
		System.out.println("Row Count:"+ReadExcelFile.getRowCount("EmployeeListData",0));
		System.out.println("Col Count:"+ReadExcelFile.getColCount("EmployeeListData",0));
		for(int i=0;i<ReadExcelFile.getRowCount("EmployeeListData",0);i++)
		{
			for(int j=0;j<ReadExcelFile.getColCount("EmployeeListData",0);j++)
			{
			//	Assert.assertEquals(obj1[i][j], obj[i][j]);
				System.out.print("i="+i+" j="+j+obj[i][j]);
			}
			System.out.println("");
		}
		
		
		int row=list.size();
		int col=list.get(0).size();
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(j==0) continue;
				System.out.print("i="+i+" j="+j+list.get(i).get(j)+" ");
			}
			System.out.println("");
		}
	}

	@DataProvider(name="dp1")
	public Object[][] dataProvider() throws IOException
	{
		return ReadExcelFile.getData("EmployeeListData",0);
	}
}
