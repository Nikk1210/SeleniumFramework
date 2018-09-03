package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.testbase.TestBase;

public class RegistrationPage extends TestBase {
	
	@FindBy(id="name_3_firstname")
	WebElement txtFirstname;
	
	@FindBy(id="name_3_lastname")
	WebElement txtLastname;
	
	//Marital status- single, married, divorced
//	@FindBy(xpath="")
//	
//	
//	//Hobbies-dance, Reading, Cricket
//	@FindBy(xpath="//*[@value='dance']")
//	WebElement chkDance;
	
	@FindBy(xpath="//*[@value='reading']")
	WebElement chkReading;
	
	@FindBy(xpath="//*[@value='cricket ']")
	WebElement chkCricket;
	
	//Country & DOB combo boxes
	@FindBy(id="dropdown_7")
	WebElement drpCountry;
	
	
	//Phone textbox	
	@FindBy(id="phone_9")
	WebElement txtPhone;
	
	//username textbox
	@FindBy(id="username")
	WebElement txtUsername;
		
	//email, about yourself textbox
	@FindBy(id="email_1")
	WebElement txtEmail;
	
	@FindBy(id="description")
	WebElement txtAboutYourself;
	
	@FindBy(id="password_2")
	WebElement txtPassword;
	
	@FindBy(id="confirm_password_password_2")
	WebElement txtConfirmPassword;
	
	
	
	
}
