package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.support.PageFactory;

public class RequestAppAdsPage extends BasePage {
	
	public AppiumDriver<AndroidElement> driver = null;

	public RequestAppAdsPage(AppiumDriver<AndroidElement> driver2) 
	{
		this.driver = driver2;
		PageFactory.initElements(new AppiumFieldDecorator(driver2), this);
	}
	
	
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/inapp_advert_image")
	public AndroidElement AppAdsIcon;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/"
			+ "android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/"
			+ "androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RadioButton")
	public AndroidElement SelctedAdvert;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/btn_next")
	public AndroidElement ContinueBtn;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/et_title")
	public AndroidElement TitleFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/app_ads_message")
	public AndroidElement MessageFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/btn_confirm")
	public AndroidElement ConfirmBtn;


}
