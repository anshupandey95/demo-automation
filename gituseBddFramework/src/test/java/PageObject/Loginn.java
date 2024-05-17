package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginn {
	WebDriver driver;
	
	public Loginn(WebDriver driver) {
		driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	


@FindBy(xpath = "//input[@class='email']")
WebElement email;
// This is findby elementss

@FindBy(xpath ="//input[@class='password']" )
WebElement pass;
///////////////////////////forgit////////////
@FindBy(xpath ="//input[@class='password']" )
WebElement pass;

/////////////////for git/////////////////////////


@FindBy(xpath ="//button[@type='submit']" )
WebElement submitt;
@FindBy(xpath ="//a[text()='Logout']" )
WebElement Logout;




public void enterEmail(String emailAdd)
{
	email.clear();
	email.sendKeys(emailAdd);
}

public void enterPassword(String pwd)
{
	pass.clear();
	pass.sendKeys(pwd);
}

public void clickOnLoginButton()
{
	submitt.click();
}

public void clickOnLogOutButton()
{
	Logout.click();
}

}
