package utils;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

//import env.DriverUtil;
import pages.BaseTest;

import org.openqa.selenium.WebDriver;

public class ScreenShotMethods extends BaseTest {
	//protected WebDriver driver = DriverUtil.getDefaultDriver();

	/** Method to take screen shot and save in ./screenShots folder */
	public static void takeScreenShot() throws IOException {
		
		if(prop.getProperty("screenShot").equals("y"))
		{
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		DateFormat dateFormat = new SimpleDateFormat("MMMM-dd-yyyy-z-HH:mm:ss", Locale.ENGLISH);
		Calendar cal = Calendar.getInstance();
		//System.out.println(dateFormat.format(cal.getTime()));

		//String filepath= current_path+"\\screenShot\\"+dateFormat.format(cal.getTime()) + ".png";
		String filepath= current_path+"\\screenShot\\"+ System.currentTimeMillis() + ".png";
		System.out.println("Screenshot path: "+ filepath);
		//System.currentTimeMillis()
		FileUtils.copyFile(scrFile, new File( filepath ));
		}
	}
}
