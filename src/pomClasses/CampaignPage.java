package pomClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLib.Genericlib;


public class CampaignPage 
{
	public	Genericlib lib = new Genericlib();	
	public WebDriver driver;
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement imgaddBtn;

	public WebElement getImgaddBtn() 
	{
		return imgaddBtn;
	}
	public CampaignPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public CreateCampaignPage navigateToCreateCAMP()
	{
		getImgaddBtn().click();
		return new CreateCampaignPage(driver);
	}

}
