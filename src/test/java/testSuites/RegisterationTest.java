package testSuites;


import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.*;
import drivers.RealDevice;

public class RegisterationTest extends BaseTest {
	
	@DataProvider
	public String[][] getExcelData() throws InvalidFormatException, IOException{
		  ReadTestData read = new ReadTestData();
		  return read.getCellData("TestData/testDataFile.xls", "Sheet1");
	  }
	
	@BeforeSuite
	public void setup() throws Throwable
	{
		driver = new RealDevice();
		firstStepPage = new FirstStepPage(driver.driver);
		
	}
	
	
	@Test(priority = 1)
	public void ValidFirstStep() throws InterruptedException {
		String phone = CreatephoneNumber();
		firstStepPage.RegisterBtn.click();
		firstStepPage.NameFld.sendKeys("Ahmed Essam Automation");
		firstStepPage.ArNameFld.sendKeys(".");
		firstStepPage.PhoneFld.sendKeys(phone);
		AddPhoto(1);
		Thread.sleep(1000);
		firstStepPage.EmailFld.sendKeys("ahmed" + phone + "@gmail.com");
		while(!waitForPresence(driver.driver, 5, firstStepPage.SalesCodeFld)){scrollDown();}
		firstStepPage.PasswordFld.sendKeys("1234567z");
		driver.driver.navigate().back();
		while(!waitForPresence(driver.driver, 5, firstStepPage.NextBtn)){scrollDown();}
		firstStepPage.SalesCodeFld.sendKeys("AEA-D50-0833");
		AddPhoto(2);
		Thread.sleep(1000);
		firstStepPage.TermsCheck.click();
		firstStepPage.NextBtn.click();
		assertTrue(firstStepPage.ChangeIcon.isDisplayed());
		
	  }
	
	
	
	
	public String CreatephoneNumber(){
		
		ArrayList<String> arlist = new ArrayList<String>( );
		arlist.add("011");
		arlist.add("012");
		arlist.add("015");
		arlist.add("010");
		
		Random random = new Random();
		String prefix = arlist.get(random.nextInt(arlist.size()));
		
		String number =  Integer.toString(10000000 + random.nextInt(90000000));
		
		String phone = prefix + number;
		return phone;
	}
	
	public void AddPhoto(int number){
		if(number == 1){firstStepPage.ProfileImageFld.click();}
		if(number == 2){firstStepPage.NationalImageFld.click();}
		firstStepPage.SelectFromGalleryTxt.click();
		firstStepPage.PhotosIcon.click();
		firstStepPage.WhatsappTxt.click();
		firstStepPage.selectedImg.click();
		firstStepPage.CropBtn.click();
	}

}
