package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import GenericLib.Genericlib;
import pomClasses.Home_Page;
import pomClasses.Vtiger_Commercial_Open;

public class BaseClass 
{
	public Genericlib lib;
	public WebDriver driver;

	@BeforeClass
	public void configBC()
	{
		System.out.println("==========LAUNCHING BROWSER===========");
		System.setProperty("webdriver.chrome.driver", "../Vtiger/Driver exe/chromedriver.exe");
		lib = new Genericlib();
		driver = new ChromeDriver();
		lib.maximizewindow(driver);
	}

	@BeforeMethod
	public void configBM() throws Throwable
	{
		lib = new Genericlib();
		lib.chromeDriver();
		//driver = new ChromeDriver();
		String url = lib.getvaluesfromProp("URL");
		String Uname=lib.getvaluesfromProp("USERNAME");
		String Pass=lib.getvaluesfromProp("PASSWORD");
		//WebDriver driver = new ChromeDriver();
		driver.get(url);
		Vtiger_Commercial_Open v1 = new Vtiger_Commercial_Open(driver);
		v1.login(Uname, Pass);
		System.out.println("=========LOGIN===========");
	}


	@AfterMethod
	public void configAM() throws Throwable
	{
		Home_Page hp= new Home_Page(driver);
		hp.logOut();
		System.out.println("========LOGOUT============");
	}

	@AfterClass
	public void configAC()
	{
		System.out.println("==========CLOSE BROWSER===========");
		driver.close();
	}
}


