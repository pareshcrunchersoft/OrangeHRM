package utils;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class InputMethods extends SelectElementByType implements BaseTest {
	// SelectElementByType eleType= new SelectElementByType();
	private WebElement dropdown = null;
	private Select selectList = null;


	public void enterText(String accessType, String text, String accessName) {
		wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		driver.findElement(getelementbytype(accessType, accessName)).sendKeys(text);
	}

	
	public void clearText(String accessType, String accessName) {
		wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		driver.findElement(getelementbytype(accessType, accessName)).clear();
	}

	
	public void selectelementfromdropdownbytype(Select select_list, String bytype, String option) {
		if (bytype.equals("selectByIndex")) {
			int index = Integer.parseInt(option);
			select_list.selectByIndex(index - 1);
		} else if (bytype.equals("value"))
			select_list.selectByValue(option);
		else if (bytype.equals("text"))
			select_list.selectByVisibleText(option);
	}


	public void selectOptionFromDropdown(String accessType, String optionBy, String option, String accessName) {
		dropdown = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		selectList = new Select(dropdown);

		if (optionBy.equals("selectByIndex"))
			selectList.selectByIndex(Integer.parseInt(option) - 1);
		else if (optionBy.equals("value"))
			selectList.selectByValue(option);
		else if (optionBy.equals("text"))
			selectList.selectByVisibleText(option);
	}

	// method to select all option from dropdwon list
	// public void select_all_option_from_multiselect_dropdown(String
	// access_type, String access_name)
	// {
	// dropdown = driver.findElement(getelementbytype(access_type,
	// access_name));
	// selectList = new Select(dropdown);
	//
	// //Select all method not present in JAVA
	// }


	public void unselectAllOptionFromMultiselectDropdown(String accessType, String accessName) {
		dropdown = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		selectList = new Select(dropdown);
		selectList.deselectAll();
	}


	public void deselectOptionFromDropdown(String accessType, String optionBy, String option, String accessName) {
		dropdown = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		selectList = new Select(dropdown);

		if (optionBy.equals("selectByIndex"))
			selectList.deselectByIndex(Integer.parseInt(option) - 1);
		else if (optionBy.equals("value"))
			selectList.deselectByValue(option);
		else if (optionBy.equals("text"))
			selectList.deselectByVisibleText(option);
	}

	
	public void checkCheckbox(String accessType, String accessName) {
		WebElement checkbox = wait
				.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		if (!checkbox.isSelected())
			checkbox.click();
	}


	public void uncheckCheckbox(String accessType, String accessName) {
		WebElement checkbox = wait
				.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		if (checkbox.isSelected())
			checkbox.click();
	}


	public void toggleCheckbox(String accessType, String accessName) {
		wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName))).click();
	}


	public void selectRadioButton(String accessType, String accessName) {
		WebElement radioButton = wait
				.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
		if (!radioButton.isSelected())
			radioButton.click();
	}


	public void selectOptionFromRadioButtonGroup(String accessType, String option, String by, String accessName) {
		List<WebElement> radioButtonGroup = driver.findElements(getelementbytype(accessType, accessName));
		for (WebElement rb : radioButtonGroup) {
			if (by.equals("value")) {
				if (rb.getAttribute("value").equals(option) && !rb.isSelected())
					rb.click();
			} else if (by.equals("text")) {
				if (rb.getText().equals(option) && !rb.isSelected())
					rb.click();
			}
		}
	}
	
	public static String getSelectedTextFromDDL(WebElement we)
	{
		Select selectList = new Select(we);
		String text=selectList.getFirstSelectedOption().getText();
		return text;
	}
}
