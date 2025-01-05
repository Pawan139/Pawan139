package StepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import Base.BaseClass;
import PageObject.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import io.cucumber.core.cli.Main;

public class StepDef extends BaseClass{
	
	public StepDef step;
	public LoginPage loginpage;

	public BaseClass baseclasss;
	
	@Given("setUp")
	public void setUp() throws IOException
	{
		initialization();
		loginpage = new LoginPage();
	}
		
	
	@Given("User enters credentials")
	public void User_enters_credentials() 
	{
			
		String expectedtitleofhomepage ="GTPL Bank Home Page";
		String actualtitleofhomepage= loginpage.titleofpage();
		System.out.println("Title of page is " + actualtitleofhomepage);
		
	}
	@When("User enters email and Password")
	public void User_enters_email_and_Password() throws IOException
	{
		loginpage.loginpage();
		 
		}


	@Then("User clicks on Login")
	public void User_clicks_on_Login() throws IOException 
	{
		loginpage.loginpagesubmit();
		
	}
	
	@And("Close browser")
	public void Close_browser() {
		driver.quit();
		
		
	}

}
