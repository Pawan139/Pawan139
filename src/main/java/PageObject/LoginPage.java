	package PageObject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;


public class LoginPage extends BaseClass
{
	
	

	@FindBy(xpath="//input[@name='uid']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement submit;
	
	
	
	public LoginPage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	String usernamee="mngr600123";
	String passwordd= "numegym";
	
	
	public String titleofpage() {
		
		return driver.getTitle();
		
	}
	public void loginpage() throws IOException 
	{
		username.sendKeys(usernamee);
		takeScreenshotAtEndOfTest();
		
		
		password.sendKeys(passwordd);
		takeScreenshotAtEndOfTest();
	}
	public void loginpagesubmit() throws IOException 
	{
		
		submit.click();
		takeScreenshotAtEndOfTest();
	}
	
}
