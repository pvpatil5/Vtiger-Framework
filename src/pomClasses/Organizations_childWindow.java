package pomClasses;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLib.Genericlib;

public class Organizations_childWindow 
{
	public WebDriver driver;
	public	Genericlib lib = new Genericlib();

	@FindBy(id="search_txt")
	private WebElement OrgChildSearch;

	public WebElement getOrgChildSearch() {
		return OrgChildSearch;
	}

	@FindBy(xpath="//input[@type='button']")
	private WebElement OrgChildbutton;


	public WebElement getOrgChildbutton() {
		return OrgChildbutton;
	}
	@FindBy(id="1")
	private WebElement searchResult;

	public WebElement getSearchResult() {
		return searchResult;
	}



	public Organizations_childWindow(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void perforActionChild() throws Throwable
	{
		getOrgChildSearch().sendKeys(lib.getExcelDataFixSHEET("Sheet1", 1, 3));
		getOrgChildbutton().click();
		Thread.sleep(2000);		
		getSearchResult().click();

		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		lib.switchParent(driver);


	}


}
