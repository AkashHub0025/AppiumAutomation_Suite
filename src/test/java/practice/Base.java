package practice;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

class Base {  
	static AndroidDriver<AndroidElement> driver;
	public static AndroidDriver<AndroidElement> DriverCapabilities() throws MalformedURLException {
	//public static void main(String[]args) throws MalformedURLException{	
	String path=System.getProperty("user.dir");
		File appDir=new File(path);
		System.out.println("appDir : "+appDir);
		File app=new File(appDir,"ApiDemos-debug.apk");
	    DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Test001_Emulator");
      //uiautomator2 to automate android app
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
       driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        System.out.println("------Test Case Started-------");
        
        return driver;
		}

	}


