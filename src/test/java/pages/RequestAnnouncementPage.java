package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.support.PageFactory;

public class RequestAnnouncementPage extends BasePage{
	
	public AppiumDriver<AndroidElement> driver = null;

	public RequestAnnouncementPage(AppiumDriver<AndroidElement> driver2) 
	{
		this.driver = driver2;
		PageFactory.initElements(new AppiumFieldDecorator(driver2), this);
	}
	
	
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/announcement_image")
	public AndroidElement AnnouncementIcon;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/title_text")
	public AndroidElement TitleFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/announcement_text")
	public AndroidElement AnnouncementFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/announcement_submit")
	public AndroidElement SubmitBtn;

}
