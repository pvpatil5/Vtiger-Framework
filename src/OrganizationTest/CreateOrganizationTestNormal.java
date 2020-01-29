package OrganizationTest;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import GenericLib.Genericlib;
import pomClasses.Addmember;
import pomClasses.Create_Organizations;
import pomClasses.Home_Page;
import pomClasses.Organization_Info;
import pomClasses.Organizations_Page;
import pomClasses.Organizations_childWindow;
import pomClasses.Vtiger_Commercial_Open;
public class CreateOrganizationTestNormal extends BaseClass
{
	//WebDriver driver;
	@Test
	public void TestStart() throws Throwable
	{
		GenericLib.Genericlib lib = new Genericlib();
		//step 1:Navigate to Org 
		Home_Page h1 = new Home_Page(driver);
		h1.getorgLink().click();
		//step 2: Click on new add org button
		Organizations_Page o1 = new Organizations_Page(driver);
		o1.getAddbutton().click();
		//Step 3:create new org
		Create_Organizations c1 = new Create_Organizations(driver);
		String orgName=lib.getExcelDataFixSHEET("Sheet1",0,0)+lib.genRandomvalue();
		c1.getOrgnamebox().sendKeys(orgName);
		c1.getEmailid().sendKeys(lib.getExcelDataFixSHEET("Sheet1",1,0));
		c1.getPhoneno().sendKeys(lib.getExcelDataFixSHEET("Sheet1",2,0));
		c1.getAddimage().click();
		//step 4:switch to sswitchChild
		lib.implicitWait(driver);
		lib.switchChild(driver);
		Addmember a1= new Addmember(driver);
		a1.selectmember();
		driver.switchTo().alert().accept();
		//step 5:switch to parent
		lib.switchParent(driver);
		lib.implicitWait(driver);
		//step 6:save newly created org
		c1.getSave().click();
		lib.implicitWait(driver);
		// step 7:Check org created or not 
		Organization_Info oi = new Organization_Info(driver);
		lib.implicitWait(driver);
		String actual_name =oi.orgnameText().getText();
		Assert.assertEquals(actual_name, orgName);
		System.out.println("Data Inserted");
		
	}
}

