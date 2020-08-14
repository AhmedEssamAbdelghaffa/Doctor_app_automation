package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.support.PageFactory;

public class MarketingPaymentMethodPage {
	
	public AppiumDriver<AndroidElement> driver = null;

	public MarketingPaymentMethodPage(AppiumDriver<AndroidElement> driver2) 
	{
		this.driver = driver2;
		PageFactory.initElements(new AppiumFieldDecorator(driver2), this);
	}
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/quota_radio")
	public AndroidElement QuotaBtn;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/points_radio")
	public AndroidElement PointsBtn;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/credit_radio")
	public AndroidElement CreditCardBtn;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/masaryRadioBtn")
	public AndroidElement MasaryBtn;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/amanRadioBtn")
	public AndroidElement AmanBtn;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/cashRadioBtn")
	public AndroidElement CashBtn;
	
	
	@AndroidFindBy(xpath="com.dgwell.caresquare.doctor:id/request")
	public AndroidElement RequestBtn;

}
