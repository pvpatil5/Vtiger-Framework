package ContactsTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import GenericLib.Genericlib;
import pomClasses.ContactsPage;
import pomClasses.CreateContactPage;
import pomClasses.Home_Page;

public class TestContact2 extends BaseClass
{
	public Genericlib lib = new Genericlib();
	@Test
	public void testStart() throws Throwable
	{
		Home_Page hp = new Home_Page(driver);
		hp.getContactLink().click();
		ContactsPage cp = new ContactsPage(driver);
		cp.getAddBtn().click();
		CreateContactPage ccp = new CreateContactPage(driver);
		ccp.getLastname().sendKeys(lib.getExcelDataFixSHEET("sheet3",0, 0)+lib.genRandomvalue());
		lib.implicitWait(driver);
		ccp.getSaveBtn().click();
	}

}

