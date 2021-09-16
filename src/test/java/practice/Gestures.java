package practice;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Gestures extends Base{

public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=DriverCapabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
//Tap
TouchAction t=new TouchAction(driver);
WebElement expandList=driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
t.tap(tapOptions().withElement(element(expandList))).perform();
}
}