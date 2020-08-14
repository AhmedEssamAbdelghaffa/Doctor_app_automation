package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.support.PageFactory;

public class RequestGoogleSearchCampaignPage extends BasePage {
	
	public AppiumDriver<AndroidElement> driver = null;

	public RequestGoogleSearchCampaignPage(AppiumDriver<AndroidElement> driver2) 
	{
		this.driver = driver2;
		PageFactory.initElements(new AppiumFieldDecorator(driver2), this);
	}
	
	
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/google_search")
	public AndroidElement GoogleSearchIcon;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/etName")
	public AndroidElement GoogleSearchNameFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/etMessage")
	public AndroidElement GoogleSearchMessageFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/etKeyWords")
	public AndroidElement GoogleSearchKeywordsFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/btn_request")
	public AndroidElement RequestBtn;

}
