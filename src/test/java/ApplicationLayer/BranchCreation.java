package ApplicationLayer;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mongodb.operation.DropCollectionOperation;

public class BranchCreation {
WebDriver driver;

public BranchCreation(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//tbody/tr[2]/td[1]/a[1]/img[1]")
WebElement clickbranches;
@FindBy(xpath = "//input[@id='BtnNewBR']")
WebElement clicknewbranch;
@FindBy(xpath = "//input[@id='txtbName']")
WebElement name;
@FindBy(xpath = "//input[@id='txtAdd1']")
WebElement add1;
@FindBy(xpath = "//input[@id='Txtadd2']")
WebElement add2;
@FindBy(xpath = "//input[@id='txtadd3']")
WebElement add3;
@FindBy(xpath= "//input[@id='txtArea']")
WebElement area;
@FindBy(xpath = "//input[@id='txtZip']")
WebElement zipcode;
@FindBy(xpath = "//select[@id='lst_counrtyU']")
WebElement selectcountry;
@FindBy(xpath = "//select[@id='lst_stateI']")
WebElement selectstate;
@FindBy(xpath = "//select[@id='lst_cityI']")
WebElement selectcity;
@FindBy(xpath = "//input[@id='btn_insert']")
WebElement clicksubmitbtn;
@FindBy(xpath="//img[@src='images/admin_but_03.jpg']")
WebElement logout;

public void Clickbrances()
{
	Actions ac = new Actions(driver);
	ac.moveToElement(clickbranches).click().perform();
}
public void ClickNewbranch()
{
	Actions ac = new Actions(driver);
	ac.moveToElement(clicknewbranch).click().perform();
}
public void newBranchCreation()
{
	this.name.sendKeys("TanukuBranch");
	this.add1.sendKeys("Tanuku");
	this.add2.sendKeys("Tanuku");
	this.add3.sendKeys("Tanuku");
	this.area.sendKeys("Tanuku");
	this.zipcode.sendKeys("534330");
}
	public void selectcountry(String Countryname)
	{
		Select country = new Select(selectcountry);
		country.selectByVisibleText(Countryname);
	}
	public void selectstate(String State)
	{
		Select state = new Select(selectstate);
		state.selectByVisibleText(State);
	}
	public void selectcity(String city)
	{
		Select city1 = new Select(selectcity);
		city1.selectByVisibleText(city);
	}
	public void clicksubmit()
	{
		Actions ac = new Actions(driver);
		ac.moveToElement(clicksubmitbtn).click().perform();
	}
	public void clickLogout()
	{
		Actions ac = new Actions(driver);
		ac.moveToElement(logout).click().perform();
	}
	
	
	/*ac.moveToElement((selectcountry)).click().per;
	ac.moveToElement(selectstate).click().perform();
	ac.moveToElement(selectcity).click().perform();
	this.selectcountry.click();
	this.selectstate.click();
	this.selectcity.click();*/
	/*String country = new Select(selectcountry).selectByVisibleText(country);
	new Select(selectcountry).selectByVisibleText("country");
	new Select(selectstate).selectByVisibleText("state");
	new Select(selectcity).selectByVisibleText("city");*/
	
	
}
