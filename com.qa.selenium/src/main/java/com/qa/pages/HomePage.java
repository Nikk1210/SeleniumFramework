package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;
import com.qa.util.Util;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//a[contains(text(),'Registration')]")
	WebElement btnRegister;
	
	@FindBy(xpath="//a[contains(text(),'Draggable')]")
	WebElement btnDraggable;
	
	@FindBy(xpath="//a[contains(text(),'Droppable')]")
	WebElement btnDroppable;
	
	@FindBy(xpath="//a[contains(text(),'Resizable')]")
	WebElement btnResizable;
	
	@FindBy(xpath="//a[contains(text(),'Selectable')]")
	WebElement btnSelectable;
	
	@FindBy(xpath="//a[contains(text(),'Sortable')]")
	WebElement btnSortable;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public RegistrationPage clickRegister() {
		Util.clickElement(btnRegister);
		return new RegistrationPage();
	}
	
}
