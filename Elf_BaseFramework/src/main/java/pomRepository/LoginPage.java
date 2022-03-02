package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import genericLibrary.ExcelUtil;


public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(id="username") private WebElement usernameTextField;
	
	@FindBy(name="pwd") private WebElement passwordTextField;
	
	@FindBy(id="loginButton") private WebElement loginButton;
	
	
	

	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
	
	
	
	
	//Business Logic or Action methods or Behavior
	public HomePage login(String username, String password) {
		ExcelUtil eu=new ExcelUtil();
		String  expectedloginPageUrl=eu.readStringDataFromExcel("Sheet1",2,0);
		
		Assert.assertEquals(driver.getCurrentUrl(), expectedloginPageUrl,"Login page is not displayed successfully");
		Reporter.log("Login page is displayed successfully", true); 
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
		
		
		
		//landing Page Object
		return new HomePage(driver);
	}
}
