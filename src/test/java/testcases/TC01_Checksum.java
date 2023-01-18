package testcases;

import com.relevantcodes.extentreports.LogStatus;
import org.example.pages.P01_CalculatorPage;
import org.example.pages.PageBases;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01_Checksum extends TestBases {
    P01_CalculatorPage CalculatorPage;

    @Test(priority = 1, description = "check sum operation in the calculator")
    public void checksum() {
        try {

            CalculatorPage = new P01_CalculatorPage(driver);
            CalculatorPage.number1.click();
            CalculatorPage.plucputton.click();
            CalculatorPage.number7.click();
            CalculatorPage.equalputton.click();
            Assert.assertEquals(CalculatorPage.resulttext.getText(), "8");
            PageBases.captureScreenshot(driver, "sumresult");
            // extend report status
            test.log(LogStatus.PASS, "Sum Pass");

        } catch (Exception e) {
            // extend report status
            test.log(LogStatus.FAIL, " Sum Failed");


        }


    }

}
