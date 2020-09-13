package testSuites;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.MarketingPaymentMethodPage;
import pages.RequestAnnouncementPage;
import drivers.RealDevice;

public class RequestAnnouncementTest extends BaseTest {
	
	@BeforeSuite
	public void setup() throws Throwable
	{
		driver = new RealDevice();
		Announcement = new RequestAnnouncementPage(driver.driver);
		payment = new MarketingPaymentMethodPage(driver.driver);
		
	}
	
	@Test(priority = 1)
	public void ValidRequest() {
		
		Announcement.MarketingIcon.click();
		scrollDown();
		scrollDown();
		Announcement.AnnouncementIcon.click();
		Announcement.TitleFld.sendKeys("Automation");
		Announcement.AnnouncementFld.sendKeys("Automation announcemnet for patinets");
		Announcement.SubmitBtn.click();
		payment.QuotaBtn.click();
		scrollDown();
		scrollDown();
		payment.RequestBtn.click();
		assertTrue(Announcement.BannerDetailsBtn.isDisplayed());
	  }

}
