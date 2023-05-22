package com.Sunshine.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log_in {
	WebDriver driver;
	public Log_in(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}



	@FindBy(xpath = "//input[@name='username']")

	private WebElement username;

	@FindBy(xpath = "//input[@type='password']")

	private WebElement password;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	public WebElement btn;



	//    @FindBy(xpath = "//span[@class=\\\"oxd-userdropdown-tab\\\"]")

	//    private WebElement logout;

	public WebElement getUsername() {

		return username;
	}

	public WebElement getPassword() {

		return password;
	}

	
	//business library
	public void logIn(String user,String pass)
	{
		username.sendKeys(user);

		password.sendKeys(pass);

		btn.click();
		
	}
}
