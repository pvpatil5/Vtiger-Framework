package OrganizationTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import GenericLib.Genericlib;
import pomClasses.Create_Organizations;
import pomClasses.Home_Page;
import pomClasses.Organization_Info;
import pomClasses.Organizations_Page;

public class CreateOrganizationPhoneTest extends BaseClass
{
	@Test
	public void Teststart() throws Throwable 
	{
		GenericLib.Genericlib lib = new Genericlib();
		//step 1:Navigate to Org 
		Home_Page h1 = new Home_Page(driver);
		h1.getorgLink().click();
		//step 2: Click on new add org button
		Organizations_Page o1 = new Organizations_Page(driver);
		o1.getAddbutton().click();
		//Step 3:create new org with phone no
		Create_Organizations c1 = new Create_Organizations(driver);
		String orgName=lib.getExcelDataFixSHEET("Sheet1",0,1)+lib.genRandomvalue();
		c1.getOrgnamebox().sendKeys(orgName);
		c1.getPhoneno().sendKeys(lib.getExcelDataFixSHEET("Sheet1",2,1));
		//step 4:save newly created org
		lib.implicitWait(driver);
		c1.getSave().click();
		// step 5:Check org created or not 
		lib.implicitWait(driver);
		Organization_Info oi = new Organization_Info(driver);
		lib.implicitWait(driver);
		String actual_name =oi.orgnameText().getText();
		Assert.assertEquals(actual_name, orgName);
		System.out.println("Data Inserted");


	}
}
