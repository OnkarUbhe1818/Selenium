package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.JavaUtility.JavaUtility;

public class ContactsPage {

	public ContactsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	private @FindBy(linkText = "Go to Advanced Search")
	WebElement goToAdvancedSearchLink;
	private @FindBy(linkText = "Go to Basic Search")
	WebElement goToBasicSearch;
	private @FindBy(css = "input[name='search_text']")
	WebElement searchForTextField;
	private @FindBy(xpath = "(//input[@type='button'])[1]")
	WebElement searchNow;
	private @FindBy(linkText = "Create Filter")
	WebElement createFilterLink;
	private @FindBy(xpath = "(//input[@value='Delete'])[1]")
	WebElement DeleteButton;
	private @FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	WebElement plusButton;
	private @FindBy(name = "lastname")
	WebElement lastName;
	private @FindBy(xpath = "(//input[@accesskey='S'])[1]")
	WebElement saveButton;
	private @FindBy(name = "support_start_date")
	WebElement startDate;
	private @FindBy(name = "support_end_date")
	WebElement endDate;
	
	
	public void plusButton()
	{
		plusButton.click();
	}
	public void lastName()
	{
		lastName.sendKeys("123");
	}
	public void startDate()
	{
		String startDate = JavaUtility.startDate("currentDate");
		
	}
	public void saveButton()
	{
		saveButton.click();
	}
	
}
