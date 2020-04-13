package pages;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/*import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;*/


public class LoginPage {
	
	public AppiumDriver<AndroidElement> driver = null;

	public LoginPage(AppiumDriver<AndroidElement> driver2) 
	{
		this.driver = driver2;
		PageFactory.initElements(new AppiumFieldDecorator(driver2), this);
	}
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/txt_email")
	public AndroidElement UsernameFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/txt_password")
	public AndroidElement PasswordField;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/btn_login")
	public AndroidElement LoginBtn;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/settings")
	public AndroidElement SettingsIcon;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/tv_error_password")
	public AndroidElement ErrorMessageTxt;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/logOut")
	public AndroidElement LogoutBtn;
	
	@AndroidFindBy(id="android:id/button1")
	public AndroidElement ConfirmBtn;

}
