package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.support.PageFactory;

public class RequestFacebookCampaignPage extends BasePage {
	
	public AppiumDriver<AndroidElement> driver = null;

	public RequestFacebookCampaignPage(AppiumDriver<AndroidElement> driver2) 
	{
		this.driver = driver2;
		PageFactory.initElements(new AppiumFieldDecorator(driver2), this);
	}
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/image_campaign")
	public AndroidElement FacebookCampaignIcon;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/campaign_name")
	public AndroidElement FacebookCampaignNameFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/image_banner")
	public AndroidElement BannerIcon;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/pick_region_layout")
	public AndroidElement RegionFld;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/"
			+ "androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/"
			+ "android.widget.FrameLayout/android.widget.RelativeLayout/"
			+ "androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/"
			+ "android.widget.CheckBox")
	public AndroidElement SelectedRegionFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/confirmButton")
	public AndroidElement ConfirmBtn;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/pick_age_layout")
	public AndroidElement AudienceFld;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/"
			+ "androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/"
			+ "android.widget.FrameLayout/android.widget.RelativeLayout/"
			+ "androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/"
			+ "android.widget.CheckBox")
	public AndroidElement SelectedAudienceFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/male_pic")
	public AndroidElement MaleIcon;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/campaign_request")
	public AndroidElement RequestBtn;

}
