package practice;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class XpathAndTextAttribute extends Base {
	public static void main(String args[]) throws MalformedURLException{
	AndroidDriver<AndroidElement> driver=DriverCapabilities();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	// xpath = //tag[@attribute='value']
	driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
	driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();  
    driver.findElementById("android:id/checkbox").click();
    driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
    driver.findElementById("android:id/edit").sendKeys("Test");
    driver.findElementByXPath("//android.widget.Button[@text='OK']").click();
	
	}
}