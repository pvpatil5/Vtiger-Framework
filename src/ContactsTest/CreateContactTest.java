package ContactsTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import GenericLib.Genericlib;
import pomClasses.ContactsPage;
import pomClasses.CreateContactPage;
import pomClasses.Home_Page;

public class CreateContactTest extends BaseClass

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

		ccp.getLastname().sendKeys(lib.getExcelDataFixSHEET("Sheet3", 0, 0)+lib.genRandomvalue());
		lib.implicitWait(driver);
		ccp.getMobile().sendKeys(lib.getExcelDataFixSHEET("sheet3",2, 0));
		ccp.getEmail().sendKeys(lib.getExcelDataFixSHEET("Sheet3", 1, 0));
		lib.implicitWait(driver);
		ccp.getSaveBtn().click();
		lib.implicitWait(driver);
	}

}




