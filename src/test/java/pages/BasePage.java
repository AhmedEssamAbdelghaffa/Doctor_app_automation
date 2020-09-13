package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class BasePage {
	
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/"
			+ "android.widget.ImageView")
	public AndroidElement MarketingIcon;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/banner_details")
	public AndroidElement BannerDetailsBtn;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout"
			+ "/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout"
			+ "/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout"
			+ "/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]"
			+ "/android.widget.ImageView")
	public AndroidElement Calendar;

}
