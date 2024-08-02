package testCases;
import org.testng.annotations.Test;
import com.crm.BaseClass.VTigerBaseClass;
import com.crm.Pom.HomePage;
import com.crm.Pom.OrganizationPage;

public class CreateOrganizationWithIndustry extends VTigerBaseClass {

	@Test
	public void main() throws InterruptedException
	{
		HomePage ref1 = new HomePage(driver);
		ref1.organizationLink();
		OrganizationPage ref2 = new OrganizationPage(driver);
		ref2.createOrganPlusButton();
		ref2.organName();
		ref2.industryDropDown();
		ref2.saveButton();
		Thread.sleep(4000);
		
		
	}
}
