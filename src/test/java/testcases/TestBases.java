package testcases;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import static org.example.capabilities.Capabilities.baseCapabilities;

public class TestBases {
    static AndroidDriver<AndroidElement> driver;
    // extend report
    protected static ExtentReports report = new ExtentReports(System.getProperty("user.dir")+"/CalulatorTestReport.html");
    protected static ExtentTest test = report.startTest("Calulator App");

    @BeforeTest
    public void prepare() throws IOException {
        // TODO start application with appium
        driver = baseCapabilities("AppName");

      //  PageBase.captureScreenshot(driver, "startApp");// take screenshot for app when start
    }

    @AfterClass
    public void TearDown() {
        // flush extent report
        report.endTest(test); //end report
        report.flush(); // open the report

        driver.quit();

    }




}
