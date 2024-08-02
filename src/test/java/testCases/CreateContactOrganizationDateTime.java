package testCases;

import org.testng.annotations.Test;

import com.crm.BaseClass.VTigerBaseClass;
import com.crm.Pom.ContactsPage;
import com.crm.Pom.HomePage;

public class CreateContactOrganizationDateTime extends VTigerBaseClass {

	@Test
	public void contact()
	{
		HomePage ref= new HomePage(driver);
		ref.contactLink();
		
		ContactsPage ref2= new ContactsPage(driver);
		ref2.plusButton();
		ref2.lastName();
		ref2.startDate();
		ref2.lastName();
		ref2.saveButton();
		
	}
}
