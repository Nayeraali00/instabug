package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class UserRegistrationPage extends PageBase
{

	public UserRegistrationPage(WebDriver driver) {
		super(driver);
	
}
	
	@FindBy(css="div.result")
	public WebElement successMessage ;

		

	
	}

