package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.support.PageFactory;

public class RequestBannerPage extends BasePage {
	
	public AppiumDriver<AndroidElement> driver = null;

	public RequestBannerPage(AppiumDriver<AndroidElement> driver2) 
	{
		this.driver = driver2;
		PageFactory.initElements(new AppiumFieldDecorator(driver2), this);
	}
	
	
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/banner_image")
	public AndroidElement BannerIcon;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/banner_message")
	public AndroidElement MessageFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/banner_description")
	public AndroidElement DescriptionFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/banner_submit")
	public AndroidElement SubmitBtn;
	

}
