package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.support.PageFactory;

public class SecondStepPage {
	
	public AppiumDriver<AndroidElement> driver = null;

	public SecondStepPage(AppiumDriver<AndroidElement> driver2) 
	{
		this.driver = driver2;
		PageFactory.initElements(new AppiumFieldDecorator(driver2), this);
	}
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/txt_title")
	public AndroidElement TitleFld;
	
	// hello from the other side helookadokc kkkkca
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/txt_bio1")
	public AndroidElement BioFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/txt_title_ar")
	public AndroidElement ArTitleFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/txt_bio1_ar")
	public AndroidElement ArBioFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/img_male")
	public AndroidElement MaleGenderIcon;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/txt_specialist")
	public AndroidElement SpecialistIcon;
	
	@AndroidFindBy(id="android:id/text1")
	public AndroidElement GraduationFld;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout"
			+ "/android.widget.ListView/android.widget.TextView[8]")
	public AndroidElement YearSelected;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/autoCompleteSpecialities")
	public AndroidElement SpecialitiesFld;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout"
			+ "/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout"
			+ "/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView"
			+ "/android.widget.LinearLayout/android.widget.TextView[2]")
	public AndroidElement SpecialitySelected;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/img_certificates")
	public AndroidElement CertificatesIcon;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/certificate_title")
	public AndroidElement CertificateTitleFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/certificate_titleAr")
	public AndroidElement CertificateArTitleFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/certificate_location")
	public AndroidElement CertificateUniversityFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/certificate_locationAr")
	public AndroidElement CertificateArUniversityFld;
	
	@AndroidFindBy(id="android:id/text1")
	public AndroidElement CertificateIssuanceDateFld;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout"
			+ "/android.widget.ListView/android.widget.TextView[7]")
	public AndroidElement CertificateDateSelectedFld;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/btn_add")
	public AndroidElement CertificateAddBtn;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/back")
	public AndroidElement CertificateBackBtn;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/btn_confirm")
	public AndroidElement ConfirmBtn;
	
	@AndroidFindBy(id="com.dgwell.caresquare.doctor:id/txt_name_clinic")
	public AndroidElement ClinicNameFld;
	
	
	
	
	

}
