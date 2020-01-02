package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployee extends BaseTest{

	@FindBy(css="div.head>h1")
	public WebElement head;
	
	@FindBy(css="input#firstName")
	public WebElement firstName;
	
	@FindBy(css="input#lastName")
	public WebElement lastName;
	
	@FindBy(css="input#photofile")
	public WebElement photofile;

	@FindBy(css="input#btnSave")
	public WebElement btnSave;
	
	@FindBy(css="input#photofile")
	public WebElement fileUploader;
	
	@FindBy(css="label.fieldHelpBottom")
	public WebElement uploadLabel;
	
	@FindBy(css="a#menu_pim_addEmployee")
	public WebElement menuAddEmployee;
	
	@FindBy(css="input#user_name")
	public WebElement username;
	
	@FindBy(css="input#user_password")
	public WebElement password;
	
	@FindBy(css="input#re_password")
	public WebElement confirmPassword;
	
	@FindBy(css="select#status")
	public WebElement statusDDL;
	
	@FindBy(css="input#chkLogin")
	public WebElement chkLogin;
	
	
	public AddEmployee()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getbackground()
	{
		return menuAddEmployee.getCssValue("background");
	}
	
	public boolean isUsernameEnable()
	{
		return username.isEnabled();
	}
	
	public boolean isPasswordEnable()
	{
		return password.isEnabled();
	}
	public boolean isConfirmPasswordEnable()
	{
		return confirmPassword.isEnabled();
	}
	public boolean isStatusDDLEnable()
	{
		return statusDDL.isEnabled();
	}
	
	public boolean isUsernameDisplayed()
	{
		return username.isDisplayed();
	}
	
	public boolean isPasswordDisplayed()
	{
		return password.isDisplayed();
	}
	public boolean isConfirmPasswordDisplayed()
	{
		return confirmPassword.isDisplayed();
	}
	public boolean isStatusDDLDisplayed()
	{
		return statusDDL.isDisplayed();
	}
	
	public void selectCheckLogin()
	{
		chkLogin.click();
	}
	
	public void addEmployee(String fname, String lastname, String photographPath )
	{
		
		firstName.sendKeys(fname);
		lastName.sendKeys(lastname);
		photofile.sendKeys(photographPath);
		btnSave.click();
	}
}
