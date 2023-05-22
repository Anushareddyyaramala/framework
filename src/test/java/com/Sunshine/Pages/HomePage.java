package com.Sunshine.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Sunshine.BaseClass.BaseTest;

/**
 * @author KT1547
 * @CreatedDate 03-05-2023
 * @param This class contains all the java specific generic methods
 * @outputparam  returns particular datatypes
 */


public class HomePage extends BaseTest {
	WebDriver driver;
	//rule-1 create a separate class

	//rule-2 find the elements by using @findby annotation
	//webelement for Add button

	@FindBy(xpath="//span[text()='Admin']")
	public WebElement Adminbutton;


	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	public WebElement Addbutton;
	@FindBy(xpath="//div[@class='oxd-layout-context']")private WebElement frame;
	//webelement for select domain

	@FindBy(xpath="//div[@class='oxd-select-text--after'][1]")
	public WebElement userrole;

	@FindBy(linkText="Admin")
	private WebElement admin;


	//webelement for typeforhits
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	public WebElement EmployeeName;

	//webelement for select tag
	@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'][2]")
	public WebElement status;
	
	@FindBy(xpath="//div[text()='Enabled']")
	private WebElement enabled;
	
	//webelement for username
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active'][2]")
	private WebElement username;

	//webelement for password
	@FindBy(xpath="//input[@type='password'][1]")
	private WebElement password;

	//webelement for confirmpw
	@FindBy(xpath="//input[@type='password'][2]")
	private WebElement confirmpassword;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;

	//3.create getters method for webelements

	public void userrole() {
		wUtil.handleDropDown(userrole, 1);
	}

	public WebElement getTypeforhints( ) {
		return EmployeeName;
	}
	


	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmpassword(String repw) {
		return confirmpassword;
	}
	
	

	//4.create driver instance

	public HomePage(WebDriver driver){

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	//Business library
	public void homepagedetails(String hints, String uname, String pword, String repeat )
	{
		userrole.click();
		admin.click();
		EmployeeName.sendKeys(hints);
		status.click();
		enabled.click();
		username.sendKeys(uname);
		password.sendKeys(pword);
		confirmpassword.sendKeys(repeat);
		submit.click();
	}
}




