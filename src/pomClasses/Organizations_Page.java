package pomClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organizations_Page 
{

	public WebDriver driver;
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement addbutton;


	public WebElement getAddbutton() 
	{
		return addbutton;
	}



	public Organizations_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public Create_Organizations navigateToCreateOrg()
	{
		getAddbutton().click();
		return new Create_Organizations(driver);
	}
}


