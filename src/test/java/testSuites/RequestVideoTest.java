package testSuites;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.MarketingPaymentMethodPage;
import pages.RequestVideoPage;
import drivers.RealDevice;

public class RequestVideoTest extends BaseTest {
	
	@BeforeSuite
	public void setup() throws Throwable
	{
		driver = new RealDevice();
		video = new RequestVideoPage(driver.driver);
		payment = new MarketingPaymentMethodPage(driver.driver);
		
	}
	
	@Test(priority = 1)
	public void ValidRequest() {
		video.MarketingIcon.click();
		video.VideoIcon.click();
		video.SunDayIcon.click();
		video.LocationFld.click();
		video.SelctedLocationFld.click();
		video.NextBtn.click();
		video.TopicFld.sendKeys("Automation video topic");
		video.ScriptFld.sendKeys("Automation video draft script");
		video.RequestBtn.click();
		payment.QuotaBtn.click();
		scrollDown();
		scrollDown();
		payment.RequestBtn.click();
		assertTrue(video.VideoIcon.isDisplayed());
	  }

}
