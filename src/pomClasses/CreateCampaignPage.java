package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLib.Genericlib;

public class CreateCampaignPage 
{
	public WebDriver driver;
	public Genericlib lib = new Genericlib();
	@FindBy(xpath="//input[@name='campaignname']")
	private WebElement orgNameBox;

	public WebElement getOrgNameBox() {
		return orgNameBox;
	}

	@FindBy(xpath="//img[@alt='Select']")
	private WebElement addProduct;

	@FindBy(xpath="/html/body/table[4]/tbody/tr/td[2]/div/form/table/tbody/tr[2]"
			+ "/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td/div/input[1]")
	private WebElement saveProduct;

	public WebElement getAddProduct() {
		return addProduct;
	}


	public WebElement getSaveProduct() {
		return saveProduct;
	}

	@FindBy(xpath="//*[@id=\"targetaudience\"]")
	private WebElement targetau;

	public WebElement getTargetau()
	{
		return targetau;
	}

	@FindBy(xpath="//*[@id=\"sponsor\"]")
	private WebElement spons0r;
	
	
	
	public WebElement getSpons0r() {
		return spons0r;
	}
	@FindBy(id="dtlview_Campaign Name")
	private WebElement camp;

	public WebElement camptext() {
		return camp;
	}

	public CreateCampaignPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/*
	public CreateChildCamp navigateToCreateCamp() throws InterruptedException
	{
		getOrgNameBox().sendKeys("asaas");
		Thread.sleep(3000);
		getAddProduct().click();
		Thread.sleep(3000);
		lib.switchChild(driver);
		CreateChildCamp ccp = new CreateChildCamp(driver);
		ccp.actonChildCamp();
		Thread.sleep(3000);
		getSaveProduct().click();
		Thread.sleep(3000);
		lib.switchParent(driver);
		return new CreateChildCamp(driver);
	}*/


}
