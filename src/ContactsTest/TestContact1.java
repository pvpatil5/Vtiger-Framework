package ContactsTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import GenericLib.Genericlib;
import pomClasses.ContactsPage;
import pomClasses.CreateContactPage;
import pomClasses.Home_Page;

public class TestContact1 extends BaseClass
{
	public Genericlib lib = new Genericlib();
	@Test(groups= {"smokeTest"})
	public void testStart() throws Throwable
	{
		Home_Page hp = new Home_Page(driver);
		hp.getContactLink().click();
		ContactsPage cp = new ContactsPage(driver);
		cp.getAddBtn().click();
		CreateContactPage ccp = new CreateContactPage(driver);
		ccp.getLastname().sendKeys(lib.getExcelDataFixSHEET("sheet3",1,1)+lib.genRandomvalue());
		ccp.getMobile().sendKeys(lib.getExcelDataFixSHEET("sheet3",3, 1));
		lib.implicitWait(driver);
		ccp.getSaveBtn().click();
		lib.implicitWait(driver);	
	}
}
