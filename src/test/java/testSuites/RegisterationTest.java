package testSuites;


import static org.testng.Assert.assertTrue;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
		secondStepPage = new SecondStepPage(driver.driver);
		thirdStepPage = new ThirdStepPage(driver.driver);
		lastStepPage = new LastStepsPage(driver.driver);
		
	}
	
	
	@Test(priority = 1)
	public void ValidFirstStep() throws InterruptedException {
		String phone = CreatephoneNumber();
		firstStepPage.RegisterBtn.click();
		firstStepPage.NameFld.sendKeys("Ahmed Essam Automation");
		firstStepPage.ArNameFld.sendKeys(".");
		firstStepPage.PhoneFld.sendKeys(phone);
		AddPhoto(1);
		Thread.sleep(10000);
		firstStepPage.EmailFld.sendKeys("ahmed" + phone + "@gmail.com");
		while(!waitForPresence(driver.driver, 5, firstStepPage.PasswordFld)){scrollDown();}
		firstStepPage.PasswordFld.sendKeys("1234567z");
		while(!waitForPresence(driver.driver, 5, firstStepPage.NextBtn)){scrollDown();}
		firstStepPage.SalesCodeFld.sendKeys("SSO-D10-1954");
		AddPhoto(2);
		Thread.sleep(10000);
		firstStepPage.TermsCheck.click();
		firstStepPage.NextBtn.click();
		assertTrue(firstStepPage.ChangeIcon.isDisplayed());	
	  }
	
	@Test(priority = 2)
	public void ValidConfirmationStep() throws SQLException{
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			
			myConn = DriverManager.getConnection("jdbc:mysql://35.188.181.11:3306/verification", "dgwelldev" , "xb6QpsXV4LwaYFYr");
			System.out.println("Database connection successful!\n");
			myStmt = myConn.createStatement();
			myRs = myStmt.executeQuery("select *from verification_code order by id DESC LIMIT 1,1;");
			while (myRs.next()){
				System.out.println(myRs.getString("code"));
				firstStepPage.ConfirmationFld.sendKeys(myRs.getString("code"));
				firstStepPage.ConfirmBtn.click();
				assertTrue(firstStepPage.TitleFld.isDisplayed());
			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
			if (myRs != null) {
				myRs.close();
			}
			
			if (myStmt != null) {
				myStmt.close();
			}
			
			if (myConn != null) {
				myConn.close();
			}
		}
	}
	
	@Test(priority = 3)
	public void ValidSecondStep(){
		secondStepPage.TitleFld.sendKeys("Automation doctor title");
		secondStepPage.BioFld.sendKeys("Automation doctor bio");
		secondStepPage.ArTitleFld.sendKeys(".");
		secondStepPage.ArBioFld.sendKeys(".");
		scrollDown();
		scrollDown();
		secondStepPage.MaleGenderIcon.click();
		secondStepPage.SpecialistIcon.click();
		secondStepPage.GraduationFld.click();
		secondStepPage.YearSelected.click();
		while(!waitForPresence(driver.driver, 5, secondStepPage.SpecialitiesFld)){scrollDown();}
		secondStepPage.SpecialitiesFld.sendKeys("de");
		secondStepPage.SpecialitySelected.click();
		while(!waitForPresence(driver.driver, 5, secondStepPage.CertificatesIcon)){scrollDown();}
		secondStepPage.CertificatesIcon.click();
		secondStepPage.CertificateTitleFld.sendKeys("Automation certificate title");
		secondStepPage.CertificateArTitleFld.sendKeys(".");
		secondStepPage.CertificateUniversityFld.sendKeys("Automation certificate university");
		scrollDown();
		secondStepPage.CertificateArUniversityFld.sendKeys(".");
		scrollDown();
		secondStepPage.CertificateIssuanceDateFld.click();
		secondStepPage.CertificateDateSelectedFld.click();
		scrollDown();
		secondStepPage.CertificateAddBtn.click();
		secondStepPage.CertificateBackBtn.click();
		scrollDown();
		secondStepPage.ConfirmBtn.click();
		assertTrue(secondStepPage.ClinicNameFld.isDisplayed());
	}
	@Test(priority = 4)
	public void ValidThirdStep(){
		thirdStepPage.ClinicNameFld.sendKeys("Automation clinic name");
		thirdStepPage.ClinicPhoneFld.sendKeys("01144798975");
		thirdStepPage.ClinicLocationFld.click();
		thirdStepPage.MyLocationIcon.click();
		thirdStepPage.ConfirmLocationBtn.click();
		while(!waitForPresence(driver.driver, 5, thirdStepPage.AddressFld)){scrollDown();}
		thirdStepPage.AddressFld.sendKeys("Automation clinic address");
		thirdStepPage.CityFld.click();
		thirdStepPage.CitySelectedFld.click();
		thirdStepPage.DistrictFld.click();
		thirdStepPage.DistrictSelectedFld.click();
		thirdStepPage.FeesFld.sendKeys("300");
		while(!waitForPresence(driver.driver, 5, thirdStepPage.ArClinicNameFld)){scrollDown();}
		thirdStepPage.ArClinicNameFld.sendKeys(".");
		thirdStepPage.ArClinicLocationFld.sendKeys(".");
		thirdStepPage.SundayFld.click();
		thirdStepPage.StartTimeFld.click();
		thirdStepPage.NineClockIcon.click();
		thirdStepPage.OkBtn.click();
		thirdStepPage.EndTimeFld.click();
		thirdStepPage.TwentyTwoClockIcon.click();
		thirdStepPage.OkBtn.click();
		thirdStepPage.SlotFld.click();
		thirdStepPage.NoneSlotTxt.click();
		thirdStepPage.CloseReservationFld.click();
		thirdStepPage.NoneSlotTxt.click();
		scrollDown();
		thirdStepPage.SaveBtn.click();
		while(!waitForPresence(driver.driver, 5, thirdStepPage.ConfirmBtn)){scrollDown();}
		thirdStepPage.ConfirmBtn.click();
		assertTrue(thirdStepPage.featureTxt.isDisplayed());	
	}
	
	@Test(priority = 5)
	public void ValidFourthStep(){
		
		while(!waitForPresence(driver.driver, 5, lastStepPage.ConfirmBtn)){scrollDown();}
		lastStepPage.SelectPlanBtn.click();
		lastStepPage.ConfirmBtn.click();
		assertTrue(lastStepPage.ThankYouTxt.isDisplayed());
		
	}
	
	@Test(priority = 6)
	public void RedirectToProfileStep(){
		
		lastStepPage.DoneBtn.click();
		assertTrue(lastStepPage.DoctorStatusTxt.isDisplayed());
		
	}
	
	//new AndroidDriver<MobileElement>(null).findElementByAndroidUIAutomator("new UiSelector().textContains(\"confirm\")").click();
	
	
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
