package pages;


import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/*import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;*/


public class FirstStepPage {
	
	public AppiumDriver<AndroidElement> driver = null;

	public FirstStepPage(AppiumDriver<AndroidElement> driver2) 
	{
		this.driver = driver2;
		PageFactory.initElements(new AppiumFieldDecorator(driver2), this);
	}
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/btn_register")
	public AndroidElement RegisterBtn;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/txt_name")
	public AndroidElement NameFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/txt_name_ar")
	public AndroidElement ArNameFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/txt_phone")
	public AndroidElement PhoneFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/img_camera")
	public AndroidElement ProfileImageFld;
	
	@AndroidFindBy(xpath="	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout"
			+ "/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout"
			+ "/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout"
			+ "/android.widget.ListView/android.widget.TextView[2]")
	public AndroidElement SelectFromGalleryTxt;
	
	@AndroidFindBy(xpath="(//android.view.View[@content-desc=\"Photos\"])[2]")
	public AndroidElement PhotosIcon;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout"
			+ "/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout"
			+ "/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget"
			+ ".RecyclerView/android.widget.RelativeLayout[6]")
	public AndroidElement WhatsappTxt;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc"
			+ "=\"Photo taken on Mar 30, 2019 15:03:07\"]")
	public AndroidElement selectedImg;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/crop_image_menu_crop")
	public AndroidElement CropBtn;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/txt_email")
	public AndroidElement EmailFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/txt_password")
	public AndroidElement PasswordFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/salesCode")
	public AndroidElement SalesCodeFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/img_scan")
	public AndroidElement NationalImageFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/check_terms")
	public AndroidElement TermsCheck;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/btn_next")
	public AndroidElement NextBtn;
	
	

}
