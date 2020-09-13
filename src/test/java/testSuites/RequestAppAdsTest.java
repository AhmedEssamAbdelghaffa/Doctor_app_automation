package testSuites;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.MarketingPaymentMethodPage;
import pages.RequestAppAdsPage;
import drivers.RealDevice;

public class RequestAppAdsTest extends BaseTest {
	
	@BeforeSuite
	public void setup() throws Throwable
	{
		driver = new RealDevice();
		AppAds = new RequestAppAdsPage(driver.driver);
		payment = new MarketingPaymentMethodPage(driver.driver);
		
	}
	
	@Test(priority = 1)
	public void ValidRequest() {
		
		AppAds.MarketingIcon.click();
		scrollDown();
		scrollDown();
		AppAds.AppAdsIcon.click();
		AppAds.SelctedAdvert.click();
		while(!waitForPresence(driver.driver, 5, AppAds.ContinueBtn)){scrollDown();}
		AppAds.ContinueBtn.click();
		AppAds.TitleFld.sendKeys("Automatin app");
		AppAds.MessageFld.sendKeys("Automation app ads message");
		AppAds.ConfirmBtn.click();
		payment.QuotaBtn.click();
		scrollDown();
		scrollDown();
		payment.RequestBtn.click();
		assertTrue(AppAds.BannerDetailsBtn.isDisplayed());
	  }

}
