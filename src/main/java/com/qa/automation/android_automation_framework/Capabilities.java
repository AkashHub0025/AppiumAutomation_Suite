package com.qa.automation.android_automation_framework;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Capabilities extends DesiredCapabilities
{
	 protected AndroidDriver androidDriver;
	    private AppiumDriverLocalService service;
	protected void preparation() throws Exception {
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("platformName", "Android");
	        capabilities.setCapability("platformVersion", "10");
	        capabilities.setCapability("deviceName", "25e2e78c130d7ece");
	        capabilities.setCapability("appPackage", "com.appium");
	        capabilities.setCapability("appActivity", "com.appium.MainActivity");
	        service = AppiumDriverLocalService.buildDefaultService();
	        service.start();
	        String service_url = service.getUrl().toString();
	        System.out.println("Appium Service Address: " + service_url);
	        androidDriver = new AndroidDriver(new URL(service_url), capabilities);
	        androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }
	public void stopServer() {
	        service.stop();
	    }
}
