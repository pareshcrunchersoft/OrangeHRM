package pages;

import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BaseTest{
	
	//private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "div#forgotPasswordLink>a")
    private WebElement forgotYourPassword;

    @FindBy(id = "btnLogin")
    @CacheLookup
    private WebElement login;
    
    @FindBy(xpath="//input[@name='txtUsername']")
    private WebElement username;

    @FindBy(id="txtPassword")
    private WebElement password;
    
    @FindBy(id = "openIdLogin")
    @CacheLookup
    private WebElement Altlogin;

    @FindBy(css="div#divLogo>img")
    public WebElement OrangeCRMLogo;
    
    @FindBy(css = "a[href='http://www.orangehrm.com']")
    @CacheLookup
    private WebElement orangehrmInc;

    @FindBy(css="span#spanMessage")
    private WebElement spanMessage;
    
    
    
    private final String pageLoadedText = "";

    private final String pageUrl = "/index.php/auth/login";

    public LoginPage() {
    	PageFactory.initElements(driver, this);
    	
    }


    public LoginPage clickForgotYourPasswordLink() {
    	logger.debug("LoginPage clickForgot password link");
        forgotYourPassword.click();
        return this;
    }

    
    public DashboardPage clickLoginButton() {
        logger.debug("DashboardPage clickLoginButton()");
    	login.click();
        return new DashboardPage();
    }

    public LoginPage clickOrangehrmIncLink() {
    	logger.debug("LoginPage clickOrangehrmIncLink()");
        orangehrmInc.click();
        return this;
    }


    public DashboardPage submit(String uname, String pwd) {
        
    	logger.debug("DashboardPage submit(String uname, String pwd)");
    	username.sendKeys(uname);
        password.sendKeys(pwd);
    	
        return clickLoginButton();
    }

    public boolean verifyPageLoaded() {
//        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
//            public Boolean apply(WebDriver d) {
//                return d.getPageSource().contains(pageLoadedText);
//            }
//        });
//        return this;
       System.out.println("verfy Page load :"+ OrangeCRMLogo.isDisplayed());
        return OrangeCRMLogo.isDisplayed();
        
        
    }

    public LoginPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
    
    public String verifyErrorMsg()
    {
      return spanMessage.getText();	
    }
    
    public String getPageURL()
    {
    	System.out.println("current url: "+driver.getCurrentUrl().toString());
    	System.out.println("Page title: " +driver.getTitle().toString());
    	return driver.getTitle();
    }


}
