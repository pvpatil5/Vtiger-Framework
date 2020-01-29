package pomClasses;

import java.sql.Driver;

import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import GenericLib.Genericlib;
public class Vtiger_Commercial_Open 
{
	@FindBy(name="user_name")
	private WebElement username;

	@FindBy(name="user_password")
	private WebElement pass;

	@FindBy(id="submitButton")
	private WebElement loginbutton;
	public Vtiger_Commercial_Open(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void login(String u,String p)
	{
		username.sendKeys(u);
		pass.sendKeys(p);
		loginbutton.click();
	}
	
}

