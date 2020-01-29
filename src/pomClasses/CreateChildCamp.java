package pomClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateChildCamp
{
	@FindBy(id="search_txt")
	private WebElement childSearch;

	@FindBy(xpath="//input[@type='button']")
	private WebElement searchBtn;


	@FindBy(id="1")
	private WebElement searchResult;


	public WebElement getChildSearch() {
		return childSearch;
	}


	public WebElement getSearchBtn() {
		return searchBtn;	
	}


	public WebElement getSearchResult() {
		return searchResult;
	}

	public CreateChildCamp(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void actonChildCamp() throws InterruptedException
	{
		getChildSearch().sendKeys("santoor");
		Thread.sleep(3000);
		getSearchBtn().click();
		Thread.sleep(3000);
		getSearchResult().click();
		Thread.sleep(3000);
	}
}

