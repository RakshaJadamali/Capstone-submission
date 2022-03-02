package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="logoutLink") private WebElement logoutButton;
	
	
	
	@FindBy(xpath="(//div[@class='popup_menu_icon'])[2]") private WebElement settingButton;
	


	public WebElement getLogoutButton() {
		return logoutButton;
	}

	
	
	public WebElement getSettingButton() {
		return settingButton;
	}
	
	
	

	// Business Logic or Action methods or Behavior
	public void logout() {
		logoutButton.click();
	}
}
