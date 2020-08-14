package testSuites;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.MarketingPaymentMethodPage;
import pages.RequestFacebookCampaignPage;
import pages.RequestVideoPage;
import drivers.RealDevice;

public class RequestFacebookCampaignTest extends BaseTest {
	
	@BeforeSuite
	public void setup() throws Throwable
	{
		driver = new RealDevice();
		facebookCampaign = new RequestFacebookCampaignPage(driver.driver);
		payment = new MarketingPaymentMethodPage(driver.driver);
		
	}
	
	@Test(priority = 1)
	public void ValidRequest() {
		facebookCampaign.MarketingIcon.click();
		facebookCampaign.FacebookCampaignIcon.click();
		facebookCampaign.FacebookCampaignNameFld.sendKeys("Automation facebook campaign name");
		//FacebookCampaign.BannerIcon.click();
		facebookCampaign.RegionFld.click();
		facebookCampaign.SelectedRegionFld.click();
		facebookCampaign.ConfirmBtn.click();
		facebookCampaign.AudienceFld.click();
		facebookCampaign.SelectedAudienceFld.click();
		facebookCampaign.ConfirmBtn.click();
		scrollDown();
		scrollDown();
		facebookCampaign.MaleIcon.click();
		facebookCampaign.RequestBtn.click();
		payment.QuotaBtn.click();
		scrollDown();
		scrollDown();
		payment.RequestBtn.click();
		assertTrue(facebookCampaign.MarketingIcon.isDisplayed());
	  }

}
