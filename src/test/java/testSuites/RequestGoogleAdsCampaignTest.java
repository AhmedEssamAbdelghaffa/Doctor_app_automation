package testSuites;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.MarketingPaymentMethodPage;
import pages.RequestGoogleAdsCampaignPage;
import drivers.RealDevice;

public class RequestGoogleAdsCampaignTest extends BaseTest {
	
	@BeforeSuite
	public void setup() throws Throwable
	{
		driver = new RealDevice();
		googleAdsCampaign = new RequestGoogleAdsCampaignPage(driver.driver);
		payment = new MarketingPaymentMethodPage(driver.driver);
		
	}
	
	@Test(priority = 1)
	public void ValidRequest() {
		
		googleAdsCampaign.MarketingIcon.click();
		googleAdsCampaign.GoogleAdsIcon.click();
		googleAdsCampaign.GoogleAdsCampaignNameFld.sendKeys("Automation google ads campaign name");
		//googleAdsCampaign.BannerIcon.click();
		googleAdsCampaign.MessageFld.sendKeys("Automation google ads campaign message");
		googleAdsCampaign.RegionFld.click();
		googleAdsCampaign.SelectedRegionFld.click();
		googleAdsCampaign.ConfirmBtn.click();
		scrollDown();
		scrollDown();
		googleAdsCampaign.AudienceFld.click();
		googleAdsCampaign.SelectedAudienceFld.click();
		googleAdsCampaign.ConfirmBtn.click();
		googleAdsCampaign.MaleIcon.click();
		googleAdsCampaign.RequestBtn.click();
		payment.QuotaBtn.click();
		scrollDown();
		scrollDown();
		payment.RequestBtn.click();
		assertTrue(googleAdsCampaign.BannerDetailsBtn.isDisplayed());
	  }

}
