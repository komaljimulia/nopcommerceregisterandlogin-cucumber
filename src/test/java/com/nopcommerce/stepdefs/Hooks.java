package com.nopcommerce.stepdefs;

import com.cucumber.listener.Reporter;
import com.nopcommerce.basepage.BasePage;
import com.nopcommerce.propertyreader.PropertyReader;
import com.nopcommerce.utility.Utility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks extends BasePage {
    @Before
    public void openBrowser(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
        Reporter.assignAuthor("Prime Testing","Komal Jimulia");

    }
    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            String screenShotPath= Utility.getScreenshot(driver,scenario.getName().replace(" ","_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        closeBrowser();
    }
}
