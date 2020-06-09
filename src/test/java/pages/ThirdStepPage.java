package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.support.PageFactory;

public class ThirdStepPage {
	
	public AppiumDriver<AndroidElement> driver = null;

	public ThirdStepPage(AppiumDriver<AndroidElement> driver2) 
	{
		this.driver = driver2;
		PageFactory.initElements(new AppiumFieldDecorator(driver2), this);
	}
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/txt_name_clinic")
	public AndroidElement ClinicNameFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/txt_phone_1")
	public AndroidElement ClinicPhoneFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/img_camera")
	public AndroidElement ClinicLocationFld;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"My Location\"]")
	public AndroidElement MyLocationIcon;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/btn_confirm")
	public AndroidElement ConfirmLocationBtn;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/txt_address")
	public AndroidElement AddressFld;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
			+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/"
			+ "android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/"
			+ "android.widget.Spinner/android.widget.TextView")
	public AndroidElement CityFld;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout"
			+ "/android.widget.ListView/android.widget.TextView[2]")
	public AndroidElement CitySelectedFld;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout"
			+ "/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout"
			+ "/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout"
			+ "/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[3]"
			+ "/android.widget.Spinner/android.widget.TextView")
	public AndroidElement DistrictFld;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget"
			+ ".ListView/android.widget.TextView[3]")
	public AndroidElement DistrictSelectedFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/txt_fees")
	public AndroidElement FeesFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/txt_name_clinic_ar")
	public AndroidElement ArClinicNameFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/txt_address_ar")
	public AndroidElement ArClinicLocationFld;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout"
			+ "/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout"
			+ "/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView"
			+ "/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]"
			+ "/android.widget.LinearLayout")
	public AndroidElement SundayFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/txt_from")
	public AndroidElement StartTimeFld;
	
	@AndroidFindBy(xpath="//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"9\"]")
	public AndroidElement NineClockIcon;
	
	@AndroidFindBy(id="android:id/button1")
	public AndroidElement OkBtn;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/txt_to")
	public AndroidElement EndTimeFld;
	
	@AndroidFindBy(xpath="//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"22\"]")
	public AndroidElement TwentyTwoClockIcon;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout"
			+ "/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout"
			+ "/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout"
			+ "/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.Spinner/android.widget.TextView")
	public AndroidElement SlotFld;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView"
			+ "/android.widget.TextView[1]")
	public AndroidElement NoneSlotTxt;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout"
			+ "/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout"
			+ "/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout"
			+ "/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.Spinner/android.widget.TextView")
	public AndroidElement CloseReservationFld;
	
	/*@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView"
			+ "/android.widget.TextView[1]")
	public AndroidElement NoneCloseTxt;*/
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/btn_save")
	public AndroidElement SaveBtn;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/btn_confirm")
	public AndroidElement ConfirmBtn;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/txt_feature")
	public AndroidElement featureTxt;
	
	
}
