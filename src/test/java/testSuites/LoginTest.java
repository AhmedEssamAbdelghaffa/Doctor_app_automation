package testSuites;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.*;
import drivers.*;

public class LoginTest extends BaseTest {
	
	@DataProvider
	public String[][] getExcelData() throws InvalidFormatException, IOException{
		  ReadTestData read = new ReadTestData();
		  return read.getCellData("TestData/testDataFile.xls", "Sheet1");
	  }
	
	@BeforeSuite
	public void setup() throws Throwable
	{
		driver = new RealDevice();
		driver.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginPage = new LoginPage(driver.driver);
		
	}
	
	@Test(dataProvider = "getExcelData")
	public void InvalidLogin(String Username, String Password, String ErrorMessage) {
		loginPage.UsernameFld.sendKeys(Username);
		loginPage.PasswordField.sendKeys(Password);
		driver.driver.navigate().back();
		loginPage.LoginBtn.click();
		assertEquals(loginPage.ErrorMessageTxt.getText(), ErrorMessage);
	  }
	
	@Test//(dataProvider = "getExcelData")
	public void validLogin() {
		loginPage.UsernameFld.sendKeys("01144798975");
		loginPage.PasswordField.sendKeys("1234567z");
		driver.driver.navigate().back();
		loginPage.LoginBtn.click();
		assertTrue(loginPage.SettingsIcon.isDisplayed());
	  }

}
