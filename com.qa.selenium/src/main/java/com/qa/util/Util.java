package com.qa.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qa.testbase.TestBase;

public class Util extends TestBase {
	public static WebDriver driver;

	public Util() {
		this.driver = super.driver;
	}

	public static void clickElement(WebElement element) {
		element.click();
	}

	public static void enterText(WebElement element, String textToEnter) {
		element.sendKeys(textToEnter);
	}
	
	
	//This function will select the value from dropdown on visible text criteria
	public static void selectValue(WebElement element, String valueToSelect) {
		Select select=new Select(element);
		select.selectByVisibleText(valueToSelect);
	}
}
