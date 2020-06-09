package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.support.PageFactory;

public class LastStepsPage {
	
	public AppiumDriver<AndroidElement> driver = null;

	public LastStepsPage(AppiumDriver<AndroidElement> driver2) 
	{
		this.driver = driver2;
		PageFactory.initElements(new AppiumFieldDecorator(driver2), this);
	}
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/btn_select_plan")
	public AndroidElement SelectPlanBtn;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/btn_confirm")
	public AndroidElement ConfirmBtn;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/thankYou")
	public AndroidElement ThankYouTxt;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/done")
	public AndroidElement DoneBtn;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/doctor_status")
	public AndroidElement DoctorStatusTxt;

}
