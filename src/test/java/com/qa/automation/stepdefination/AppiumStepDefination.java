package com.qa.automation.stepdefination;

import org.openqa.selenium.WebElement;

import com.qa.automation.android_automation_framework.Capabilities;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class AppiumStepDefination extends Capabilities{
	
	//@Before({"@RaraliQATeam"})
    public void setup()throws Exception{
        preparation();
    }
@Given("^Input Data and Do Calculate Price$")
    public void doPositifTest() throws Throwable {
        androidDriver.findElementByAccessibilityId("homeButton").click();
        WebElement hargaFromApp = androidDriver.findElementByAccessibilityId("priceInput");
        WebElement disconFromApp = androidDriver.findElementByAccessibilityId("discountInput");
        hargaFromApp.sendKeys("80000");
        disconFromApp.sendKeys("20");
        String dataInput = hargaFromApp.getText();
        Double dataInputDouble = Double.parseDouble(dataInput);
        Double dataInpoutDiskon = Double.parseDouble(disconFromApp.getText());
        androidDriver.findElementByAccessibilityId("calculationButton").click();
        WebElement totalhargaFromApp = androidDriver.findElementByAccessibilityId("totalInfo");
        Double totalHarfaFromAp = Double.parseDouble(totalhargaFromApp.getText());
        Double totalharga = dataInputDouble - (dataInputDouble * (dataInpoutDiskon / 100));
        if (!totalHarfaFromAp.equals(totalharga)) {
            throw new Exception(" Error ");
        }
    }
}
