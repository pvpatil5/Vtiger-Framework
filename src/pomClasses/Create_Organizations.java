package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLib.Genericlib;

public class Create_Organizations 
{
	public WebDriver driver;
	public	Genericlib lib = new Genericlib();	
	@FindBy(xpath="/html/body/table[4]/tbody/tr/td[2]/div/form/table/tbody/tr[2]/td/table/tbody/tr/td/table/"
			+ "tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input")
	private WebElement Orgnamebox;

	@FindBy(id="phone")
	private WebElement phoneno;


	public WebElement getPhoneno() {
		return phoneno;
	}


	@FindBy(id="email1")
	private WebElement emailid;

	public WebElement getEmailid() {
		return emailid;
	}
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement save;

	public WebElement getSave() {
		return save;
	}

	@FindBy(xpath="//img[@alt='Select']")
	private WebElement addimage;

	public WebElement getAddimage() {
		return addimage;
	}

	public Create_Organizations(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}


	public WebElement getOrgnamebox() 
	{
		return Orgnamebox;
	}

	public Organization_Info naviToOrgInfo() throws Throwable
	{
		getOrgnamebox().sendKeys(lib.getExcelDataFixSHEET("Sheet1", 1, 0)+lib.genRandomvalue());
		getPhoneno().sendKeys(lib.getExcelDataFixSHEET("Sheet1", 1, 2));
		getEmailid().sendKeys(lib.getExcelDataFixSHEET("Sheet1", 1, 1));


		getAddimage().click();
		lib.switchChild(driver);
		Organizations_childWindow ow = new Organizations_childWindow(driver);
		ow.perforActionChild();

		getSave().click();
		Thread.sleep(4000);
		return new Organization_Info(driver);
	}
}


