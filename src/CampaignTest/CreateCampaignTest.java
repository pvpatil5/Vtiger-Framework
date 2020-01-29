package CampaignTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import GenericLib.Genericlib;
import pomClasses.CampaignPage;
import pomClasses.CreateCampaignPage;
import pomClasses.CreateChildCamp;
import pomClasses.Home_Page;
import pomClasses.Organization_Info;


public class CreateCampaignTest extends BaseClass
{
	Genericlib lib = new Genericlib();
	@Test
	public void TestStart() throws Throwable
	{
		//Step 1: Navigate to campaign
		Home_Page hp = new Home_Page(driver);
		hp.getMore().click();
		hp.getCamp().click();
		CampaignPage c = hp.navigateTMoreCampaign();
		c.getImgaddBtn().click();

		lib.implicitWait(driver);
		CreateCampaignPage cp = new CreateCampaignPage(driver);
		String campname="newproduct12" +lib.genRandomvalue();
		cp.getOrgNameBox().sendKeys(campname);

		cp.getAddProduct().click();

		lib.switchChild(driver);
		CreateChildCamp childpg  = new CreateChildCamp(driver);
		childpg.getChildSearch().sendKeys("santoor");
		childpg.getSearchBtn().click();
		childpg.getSearchResult().click();
		lib.switchParent(driver);
		cp.getSaveProduct().click();
		lib.implicitWait(driver);
		String	camp=cp.camptext().getText();
		Assert.assertEquals(campname, camp);
		System.out.println("Data Inserted");



	}
}
