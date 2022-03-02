package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavePage {
	
	public LeavePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Leave Types']") private WebElement leaveType;
	
	@FindBy(xpath="//span[text()='Create Leave Type']") private WebElement createLeaveType1;
	
	@FindBy(id="leaveTypeLightBox_nameField") private WebElement leaveTypeName;
	
	
	@FindBy(id="leaveTypeLightBox_commitBtn") private WebElement createLeaveType2;
	
	@FindBy(xpath="//input[@id='leaveTypeLightBox_rateCoefficient']") private WebElement leaveHour;
	
	@FindBy(xpath="//input[@id='processLeaveTimeCheckbox_createPopup']") private WebElement process;
	
	public WebElement getProcess() {
		return process;
	}

	public WebElement getLeaveHour() {
		return leaveHour;
	}

	public WebElement getCreateLeaveType2() {
		return createLeaveType2;
	}

	public WebElement getLeaveTypeName() {
		return leaveTypeName;
	}
	
	public WebElement getCreateLeaveType() {
		return createLeaveType1;
	}

	public WebElement getLeaveType() {
		return leaveType;
	}
	
	
	

}
