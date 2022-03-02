package settings;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import pomRepository.LeavePage;


public class actitime_Setting_56Test extends Base_Class{
	
	@Test
	public void validateThatUserIsAbleToCreateNewLeave()  {
		ExcelUtil eu=new ExcelUtil();
		String leaveName=eu.readStringDataFromExcel("Sheet1",0,0);
		String  expectedhomePageUrl=eu.readStringDataFromExcel("Sheet1",3,0);
		String  expectedleavePageUrl=eu.readStringDataFromExcel("Sheet1",1,0);
		homePage.getSettingButton().click();
		Assert.assertEquals(driver.getCurrentUrl(), expectedhomePageUrl,"Home page is not displayed successfully");
		Reporter.log("Home page is displayed successfully", true); 
	    leavePage.getLeaveType().click();
		Assert.assertEquals(driver.getCurrentUrl(), expectedleavePageUrl,"Leave page is not displayed successfully");
		Reporter.log("Leave page is displayed successfully", true); 
		leavePage.getCreateLeaveType().click();
		leavePage.getLeaveTypeName().sendKeys(leaveName);
		leavePage.getCreateLeaveType2().click();
		
	}

}
