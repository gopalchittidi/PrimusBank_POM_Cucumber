package ApplicationLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver;
public LoginPage(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
}
@FindBy(xpath ="//input[@id='txtuId']")
WebElement username;
@FindBy(xpath= "//input[@id='txtPword']")
WebElement password;
@FindBy(xpath = "//input[@id='login']")
WebElement Loginbtn;

public void verifyLogin(String username, String password)
{
	
	this.username.sendKeys(username);
	this.password.sendKeys(password);
}
public void clickLogin() {
	Actions ac = new Actions(driver);
	ac.moveToElement(Loginbtn).click().perform();
}
}


