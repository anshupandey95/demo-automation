package StepDefination;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.Loginn;
import io.cucumber.java.en.*;

public class stepdef {
	public Loginn log;
	public WebDriver driver;
	
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		WebDriver driver = new ChromeDriver();
		log = new Loginn(driver);
		
	    
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	    
	   
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String emailll, String passsss) {
		
		log.enterEmail(emailll);
		log.enterPassword(passsss);
	    
	    
	}

	@When("Click on Login")
	public void click_on_login() {
		log.clickOnLoginButton();
	    
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedtitle) {
		String actualtitle = driver.getTitle();
		if(expectedtitle.equals(actualtitle)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		
	    
	   
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() {
		log.clickOnLogOutButton();
	    
	    
	}

	@Then("close browser")
	public void close_browser() {
		driver.close();
		driver.quit();
		
	    
	}



}
