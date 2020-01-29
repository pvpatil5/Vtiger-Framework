package pomClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CreateContactPage 
{

	public WebDriver driver;
//@FindBy(xpath="//input[@name='lastname']")
@FindBy(xpath="/html/body/table[4]/tbody/tr/td[2]/div/form/table/tbody/tr[2]"
		+ "/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input")
	private 	WebElement lastname;

@FindBy(id="mobile")
private WebElement mobile;

@FindBy(xpath="//input[@title='Save [Alt+S]']")
private WebElement saveBtn;

@FindBy(id="email")
private WebElement email;

public WebElement getEmail() {
	return email;
}

public WebElement getLastname() {
	return lastname;
}

public WebElement getMobile() {
	return mobile;
}

public WebElement getSaveBtn() {
	return saveBtn;
}
public CreateContactPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


}
