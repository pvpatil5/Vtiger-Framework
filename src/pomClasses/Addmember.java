package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addmember 
{
	WebDriver driver;
@FindBy(name="search_text")
private WebElement searchbox;

@FindBy(name="search")
private WebElement searchbtn;

@FindBy(xpath="//*[@id=\"1\"]")
private WebElement select;
public Addmember(WebDriver driver) 
{
	
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public void selectmember() 
{
	searchbox.sendKeys("pavan");
	searchbtn.click();
	select.click();
}

}
