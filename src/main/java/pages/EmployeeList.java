package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.AssertionMethods;

public class EmployeeList extends BaseTest{
	
	@FindBy(css="#menu_pim_viewPimModule > b")
	private WebElement PIM;
	
	@FindBy(css="#menu_pim_viewEmployeeList")
	private WebElement MenuEmployeeList;

	@FindBy(css="a#menu_pim_addEmployee")
	private WebElement MenuAddEmployee;
	
	@FindBy(css="input#empsearch_employee_name_empName")
	private WebElement input_employeeName;
	
	@FindBy(css="input#searchBtn")
	private WebElement input_serchBtn;
	
	@FindBy(xpath="//div[@id='tableWrapper']//child::tr[@class='odd' or @class='even']/td[3]")
	private List<WebElement> enames;
	
	public EmployeeList()
	{
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver, 10);
	}
	
	public String verifyPageLoad()
	{
		//#555657
		String backgroundColor=MenuEmployeeList.getCssValue("background");
		System.out.println(backgroundColor);
		return backgroundColor;
	}
	
	public void clickSearchBtn(String ename)
	{
		wait.until(ExpectedConditions.elementToBeClickable(input_employeeName));
		input_employeeName.click();
		input_employeeName.clear();
		
		input_employeeName.sendKeys(ename);
		//wait.until(ExpectedConditions.textToBePresentInElement(input_employeeName, ename));
		input_serchBtn.click();
		
	}
	
	public void getEnames()
	{
		for(WebElement ename: enames)
		{
			System.out.println(ename.getText());
		}
	}
	
//	protected boolean isElementPresent(WebElement we,By by){
//        try{
//            we.findElement(by);
//            return true;
//        }
//        catch(NoSuchElementException e){
//            return false;
//        }
//    }

	public ArrayList<ArrayList<String>> getEmployeeRow()
	{
		
		ArrayList<ArrayList<String>> tableData= new ArrayList<ArrayList<String>>();
		int i=0;
		System.out.println(enames.size());
		for(WebElement ename: enames)
		{
			List<WebElement> cols=ename.findElements(By.xpath("//ancestor::tr/child::td"));
			System.out.println(cols.size());
		
			ArrayList<String> e= new ArrayList<String>();
			for(WebElement col:cols)
			{
				
				//if(col.findElement(By.xpath("/a"))!=null)
				if(AssertionMethods.isElementPresent(col, By.xpath("/a")))
				{
					String temp=col.findElement(By.xpath("/a")).getText();
					System.out.println(temp);
					e.add(temp);
				}
				System.out.println(col.getText());
				e.add(col.getText());
				
			}
			tableData.add(e);
			
			break;
		}
		
		return tableData;
	}
	
	public AddEmployee clickAddEmployeeMenu()
	{
		MenuAddEmployee.click();
		return new AddEmployee();
	}
}
