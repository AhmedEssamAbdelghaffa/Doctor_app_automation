package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.support.PageFactory;

public class RequestVideoPage extends BasePage {
	
	public AppiumDriver<AndroidElement> driver = null;

	public RequestVideoPage(AppiumDriver<AndroidElement> driver2) 
	{
		this.driver = driver2;
		PageFactory.initElements(new AppiumFieldDecorator(driver2), this);
	}
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/video_image")
	public AndroidElement VideoIcon;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/"
			+ "android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/"
			+ "android.widget.RelativeLayout[1]/android.widget.TextView")
	public AndroidElement SunDayIcon;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/pick_location_layout")
	public AndroidElement LocationFld;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/"
			+ "androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/"
			+ "android.widget.FrameLayout/android.widget.RelativeLayout/"
			+ "androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]")
	public AndroidElement SelctedLocationFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/video_next")
	public AndroidElement NextBtn;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/topic")
	public AndroidElement TopicFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/script")
	public AndroidElement ScriptFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/submitBtn")
	public AndroidElement RequestBtn;

}
