package testSuites;



import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.MarketingPaymentMethodPage;
import pages.RequestBannerPage;
import drivers.RealDevice;

public class RequestBannerTest extends BaseTest {
	
	
	
	@BeforeSuite
	public void setup() throws Throwable
	{
		driver = new RealDevice();
		banner = new RequestBannerPage(driver.driver);
		payment = new MarketingPaymentMethodPage(driver.driver);
		
	}
	
	@Test(priority = 1)
	public void ValidRequest() {
		banner.MarketingIcon.click();
		banner.BannerIcon.click();
		banner.MessageFld.sendKeys("Autmation banner message");
		banner.DescriptionFld.sendKeys("Automation banner concept description");
		banner.SubmitBtn.click();
		payment.QuotaBtn.click();
		scrollDown();
		scrollDown();
		payment.RequestBtn.click();
		assertTrue(banner.MarketingIcon.isDisplayed());
		
	  }

}
