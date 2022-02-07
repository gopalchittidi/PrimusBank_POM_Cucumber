package stepDefiniation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ApplicationLayer.BranchCreation;
import ApplicationLayer.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewBranch1 {
	WebDriver driver;
	LoginPage Login;
	BranchCreation Branch;
	@Given("^Enter the URL$")
	public void enter_the_URL() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^user enter the username And password$")
	public void user_enter_the_username_password() throws Throwable {
		Login = new LoginPage(driver);
	   Login .verifyLogin("Admin", "Admin");
	   Login.clickLogin();
	}

	@Then("^Login Sucess$")
	public void login_Sucess() throws Throwable {
	    String Expected ="adminflow";
	    String Actual = driver.getCurrentUrl();
	    if(Actual.contains(Expected))
	    {
	    	System.out.println("Login Sucess::"+Expected+"   "+Actual);
	    }
	    else
	    {
	    	System.out.println("Login failed::"+Expected+"       "+Actual);
	    }
	}

	@When("^user clicks the branches$")
	public void user_clicks_the_branches() throws Throwable {
		Branch = new BranchCreation(driver);
		Branch.Clickbrances();
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new PendingException();
	}

	@When("^user clicks the new branchcreation$")
	public void user_clicks_the_new_branchcreation() throws Throwable {
		Branch = new BranchCreation(driver);
		Branch.ClickNewbranch();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^user enter the branchname And add(\\d+) And add(\\d+) And Add(\\d+) And Area And zipcode And  user Select the country And Select the state And Select the city$")
	public void user_enter_the_branchname_And_add_And_add_And_Add_And_Area_And_zipcode_And_user_Select_the_country_And_Select_the_state_And_Select_the_city(int arg1, int arg2, int arg3) throws Throwable {
		Branch = new BranchCreation(driver);
		Branch.newBranchCreation();
		// Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@When("^user click the Submit button$")
	public void user_click_the_Submit_button() throws Throwable {
		Branch = new BranchCreation(driver);
		Branch.selectcountry("INDIA");
		Branch.selectstate("Andhra Pradesh");
		Branch.selectcity("Hyderabad");
	    Branch.clicksubmit();
		// Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
	@Then("^New branch Creation Sucessfull And Logout of the application$")
	public void new_branch_Creation_Sucessfull_And_Logout_of_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String Expected = "New Branch Creation";
		String Actual = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		if(Actual.contains(Expected))
		{
			System.out.println("New Branch Creation sucessfully::"+Expected+"       "+Actual);
		}
		else
		{
			System.out.println("Branch Craetion failed::"+Expected+"     "+Actual);
		}
		Branch = new BranchCreation(driver);
		Branch.clickLogout();
		
			driver.close();	
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}


}
