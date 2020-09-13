package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.support.PageFactory;

public class AddEventPage extends BasePage {
	
	public AppiumDriver<AndroidElement> driver = null;

	public AddEventPage(AppiumDriver<AndroidElement> driver2) 
	{
		this.driver = driver2;
		PageFactory.initElements(new AppiumFieldDecorator(driver2), this);
	}
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/addEvent")
	public AndroidElement AddEventIcon;
	
	@AndroidFindBy(id="android:id/text1")
	public AndroidElement EventTypeFld;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/"
			+ "android.widget.ListView"
			+ "/android.widget.TextView[1]")
	public AndroidElement PatientTimeSloatItem;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/"
			+ "android.widget.ListView/android.widget.TextView[2]")
	public AndroidElement MeetingItem;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/"
			+ "android.widget.ListView/android.widget.TextView[3]")
	public AndroidElement OffDayItem;
	

}
