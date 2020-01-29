package CampaignTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import pomClasses.CampaignPage;
import pomClasses.CreateCampaignPage;
import pomClasses.CreateChildCamp;
import pomClasses.Home_Page;

public class CreateCampaignTest1 extends BaseClass
{
	@Test
	public void CampCreation1()
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


		//cp.getOrgNameBox().sendKeys("newproduct12" +lib.genRandomvalue());
		// by selecting audience
		cp.getTargetau().sendKeys("Youth");

		cp.getAddProduct().click();

		lib.switchChild(driver);
		CreateChildCamp childpg  = new CreateChildCamp(driver);
		childpg.getChildSearch().sendKeys("santoor");
		childpg.getSearchBtn().click();
		childpg.getSearchResult().click();
		lib.switchParent(driver);
		lib.implicitWait(driver);
		cp.getSaveProduct().click();
		lib.implicitWait(driver);
		String	camp=cp.camptext().getText();
		Assert.assertEquals(campname, camp);
		System.out.println("Data Inserted");
		
		
	}

}
