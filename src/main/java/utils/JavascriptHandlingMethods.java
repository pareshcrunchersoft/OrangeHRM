package utils;

//import env.DriverUtil;
import pages.BaseTest;

import org.openqa.selenium.WebDriver;

public class JavascriptHandlingMethods extends BaseTest {
	//protected WebDriver driver = DriverUtil.getDefaultDriver();

	/**
	 * Method to handle alert
	 * 
	 * @param decision
	 *            : String : Accept or dismiss alert
	 */
	public void handleAlert(String decision) {
		if (decision.equals("accept"))
			driver.switchTo().alert().accept();
		else
			driver.switchTo().alert().dismiss();
	}
}
