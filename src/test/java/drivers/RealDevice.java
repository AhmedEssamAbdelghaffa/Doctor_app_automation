package drivers;

//import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;



public class RealDevice {
	
	public AppiumDriver<AndroidElement> driver = null;
	public DesiredCapabilities dc = new DesiredCapabilities();
	//public RealDevice() throws MalformedURLException 
	public RealDevice() throws Throwable {
		dc.setCapability("udId", "WGK769TKMZQKEATK");
		dc.setCapability("deviceName", "CPH1729");
		dc.setCapability("platformName", "Android");
		dc.setCapability("appPackage", "com.dgwell.caresquare.doctor");
		dc.setCapability("appActivity", ".views.activity.SplashScreenActivity");
		dc.setCapability("noReset",true);
		driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.id("com.splendapps.splendo:id/imgFirstTask")).click();
		//driver.findElement(By.id("More options")).click();
	}

}
