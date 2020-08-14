package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.support.PageFactory;

public class RequestGoogleAdsCampaignPage extends BasePage {
	
	public AppiumDriver<AndroidElement> driver = null;

	public RequestGoogleAdsCampaignPage(AppiumDriver<AndroidElement> driver2) 
	{
		this.driver = driver2;
		PageFactory.initElements(new AppiumFieldDecorator(driver2), this);
	}
	
	
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/google_ads")
	public AndroidElement GoogleAdsIcon;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/campaignName")
	public AndroidElement GoogleAdsCampaignNameFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/banner_img")
	public AndroidElement BannerIcon;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/message_edit")
	public AndroidElement MessageFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/region_edit")
	public AndroidElement RegionFld;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/"
			+ "androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/"
			+ "android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/"
			+ "android.widget.RelativeLayout[1]/android.widget.CheckBox")
	public AndroidElement SelectedRegionFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/confirmButton")
	public AndroidElement ConfirmBtn;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/audience_edit")
	public AndroidElement AudienceFld;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/"
			+ "androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/"
			+ "android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/"
			+ "android.widget.RelativeLayout[1]/android.widget.CheckBox")
	public AndroidElement SelectedAudienceFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/male_img")
	public AndroidElement MaleIcon;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/confirmBtn")
	public AndroidElement RequestBtn;

}
