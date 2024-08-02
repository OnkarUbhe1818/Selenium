package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.JavaUtility.JavaUtility;

public class OrganizationPage {

	public OrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	private @FindBy(css = "img[alt='Create Organization...']")
	WebElement createOrganPlusButton;
	private @FindBy(css = "input[name='accountname']")
	WebElement organizationName;
	private @FindBy(xpath = "(//input[@name='assigntype'])[1]")
	WebElement userCheckBox;
	private @FindBy(xpath = "(//input[@name='assigntype'])[2]")
	WebElement groupCheckBox;
	private @FindBy(xpath = "(//input[@name='button'])[1]")
	WebElement saveButton;
	private @FindBy(className = "dvHeaderText")
	WebElement header;
	private @FindBy(name =  "industry")
	WebElement industry;
	
	public void createOrganPlusButton()
	{
		createOrganPlusButton.click();
	}
	public void organName()
	{
		String name = JavaUtility.randomData("data1");
		organizationName.sendKeys(name);
	}
	public void userCheckBox()
	{
		userCheckBox.click();
	}
	public void groupCheckBox()
	{
		groupCheckBox.click();
	}
	public void saveButton()
	{
		saveButton.click();
	}
	public void industryDropDown()
	{
		Select select = new Select(industry);
		select.selectByValue("Education");
	}
	
	
	
}
