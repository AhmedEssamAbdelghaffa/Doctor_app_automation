package testSuites;


import drivers.*;
import pages.*;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class BaseTest {
	
	public RealDevice driver = null;
	public LoginPage loginPage = null;
	public FirstStepPage firstStepPage = null;
	public SecondStepPage secondStepPage = null;
	public ThirdStepPage thirdStepPage = null;
	public LastStepsPage lastStepPage = null;
	public RequestBannerPage banner = null;
	public MarketingPaymentMethodPage payment = null;
	public RequestVideoPage video = null;
	public RequestFacebookCampaignPage facebookCampaign = null;
	public RequestGoogleSearchCampaignPage googleSearchCampaign = null;

	
	
	public void scrollDown() {
		
		Dimension dimension = driver.driver.manage().window().getSize();		
		Double scrollHeightStart = dimension.getHeight() * 0.5;
		int scrollStart = scrollHeightStart.intValue();
		
		Double scrollHeightEnd = dimension.getHeight() * 0.2;
		int scrollEnd = scrollHeightEnd.intValue();
		
		new TouchAction((PerformsTouchActions) driver.driver)
		.press(PointOption.point(0, scrollStart))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
		.moveTo(PointOption.point(0, scrollEnd))
		.release().perform();
	}
	
	
	
	public static boolean waitForPresence(AppiumDriver<AndroidElement> driver, int timeLimitInSeconds, AndroidElement element){
		boolean isElementPresent;
		try{
			WebDriverWait wait = new WebDriverWait(driver, timeLimitInSeconds);
			wait.until(ExpectedConditions.visibilityOf(element));
			isElementPresent = element.isDisplayed();
			return isElementPresent;	
		}catch(Exception e){
			isElementPresent = false;
			System.out.println(e.getMessage());
			return isElementPresent;
		}
		
	}
}
