package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	private @FindBy(css = "input[name='user_name']")
	WebElement userName;
	private @FindBy(css = "input[name='user_password']")
	WebElement password;
	private @FindBy(id = "submitButton")
	WebElement loginButton;
	private @FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	WebElement administrator;
	private @FindBy(xpath = "//a[text()='Sign Out']")
	WebElement logout;
	
	public void userName(String search)
	{
		userName.sendKeys("admin");
	}
	public void password(String search)
	{
		password.sendKeys("root");
	}
	public void loginButton()
	{
		loginButton.click();
	}
	public void administrator()
	{
		administrator.click();
	}
	public void logout()
	{
		logout.click();
	}
}
