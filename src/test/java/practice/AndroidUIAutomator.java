package practice;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AndroidUIAutomator extends Base{

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=DriverCapabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElementByAndroidUIAutomator("attribute(\"value\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Text\")").click();
		
		//driver.findElementByAndroidUIAutomator("new UiSelector().clickable(true)");
		//System.out.println(driver.findElementByAndroidUIAutomator("new UiSelector().clickable(true)").size());
		
		
	}

}
