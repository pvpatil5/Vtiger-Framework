package pomClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organization_Info 
{
	@FindBy(xpath="//*[@id=\"dtlview_Organization Name\"]")
	private WebElement orgnametext;
	
	public WebElement orgnameText() {
		return orgnametext;
	}
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement user;
	
	public WebElement getUser() {
		return user;
	}
	

	public Organization_Info (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
}

