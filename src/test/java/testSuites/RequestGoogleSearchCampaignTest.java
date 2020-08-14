package testSuites;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.MarketingPaymentMethodPage;
import pages.RequestGoogleSearchCampaignPage;
import pages.RequestVideoPage;
import drivers.RealDevice;

public class RequestGoogleSearchCampaignTest extends BaseTest {
	
	@BeforeSuite
	public void setup() throws Throwable
	{
		driver = new RealDevice();
		googleSearchCampaign = new RequestGoogleSearchCampaignPage(driver.driver);
		payment = new MarketingPaymentMethodPage(driver.driver);
		
	}
	
	@Test(priority = 1)
	public void ValidRequest() {
		googleSearchCampaign.MarketingIcon.click();
		payment.QuotaBtn.click();
		scrollDown();
		scrollDown();
		payment.RequestBtn.click();
		assertTrue(googleSearchCampaign.MarketingIcon.isDisplayed());
	  }

}
