package pomClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ContactsPage
{
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement addBtn;

	public WebElement getAddBtn() {
		return addBtn;
	}
	public ContactsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
