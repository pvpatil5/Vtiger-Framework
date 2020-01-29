package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page
{
	public WebDriver driver;
	@FindBy(xpath="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td[6]/a")
	private WebElement orglink;
	public WebElement getorgLink() 
	{
		return orglink;
	}

	@FindBy(xpath="//img[@src='themes/softed/images/menuDnArrow.gif']")
	private WebElement more;
	public WebElement getMore() {
		return more;
	}
	@FindBy(linkText="Campaigns")
	private WebElement camp;

	public WebElement getCamp() {
		return camp;
	}

	@FindBy(xpath="//img[@src='themes/softed/images/Home.PNG']")
	private WebElement home;
	public WebElement getHome() {
		return home;
	}

	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement User;
	public WebElement getUser() {
		return User;
	}


	@FindBy(linkText="Sign Out")
	private WebElement Signout;

	public WebElement getSignout() {
		return Signout;
	}

	public Home_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void logOut() throws Throwable
	{

		getUser().click();
		getSignout().click();
		//driver.close();
	}
	public Organizations_Page navigateTOrgPage()
	{
		getorgLink().click();
		return new Organizations_Page(driver);
	}
	public CampaignPage navigateTMoreCampaign()
	{
		getMore().click();
		getCamp().click();
		return new CampaignPage(driver);
	}
	@FindBy(linkText="Contacts")
	private WebElement contactLink;
	
	
	public WebElement getContactLink() {
		return contactLink;
	}

	/*public Home_Page(WebDriver driver) 
	{
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	*/
}

