package testcases;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import static org.example.capabilities.Capabilities.baseCapabilities;

public class TestBases {
    static AndroidDriver<AndroidElement> driver;
    @BeforeTest
    public void prepare() throws IOException {
        // TODO start application with appium
        driver = baseCapabilities("AppName");

      //  PageBase.captureScreenshot(driver, "startApp");// take screenshot for app when start
    }

    @AfterClass
    public void TearDown() {
        driver.quit();
    }


}
