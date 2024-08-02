package com.crm.BaseClass;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.crm.JavaUtility.JavaUtility;
import com.crm.Pom.LoginPage;

public class VTigerBaseClass {

	public WebDriver driver;
	@BeforeClass
	public void preCondition() throws IOException
	{
		String browser = JavaUtility.credencials("browser");
		String url = JavaUtility.credencials("url");
		if(browser.equalsIgnoreCase("chrome"))
		{
			ChromeOptions option=new ChromeOptions();
     		option.addArguments("disable-notifications");

			driver=new ChromeDriver(option);
		}
		else if (browser.equalsIgnoreCase("edge")) 
		{
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		
	}
	
	@BeforeMethod
	public void login()
	{
		LoginPage ref = new  LoginPage(driver);
		ref.userName("admin");
		ref.password("root");
		ref.loginButton();
	}
	@AfterMethod
	public void logout()
	{
		LoginPage ref = new LoginPage(driver);
		ref.administrator();
		ref.logout();
	}
	@AfterClass
	public void postCondition()
	{
		driver.close();
	}
	
	
	
}
