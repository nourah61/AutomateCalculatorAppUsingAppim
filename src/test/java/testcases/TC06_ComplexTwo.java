package testcases;

import com.relevantcodes.extentreports.LogStatus;
import org.example.pages.P01_CalualoturPage;
import org.example.pages.PageBases;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC06_ComplexTwo extends TestBases {

    P01_CalualoturPage calualoturPage;

    @Test(priority = 6, description = "check another complex math in the calculator")
    public void ComplexTwo() {
     calualoturPage = new P01_CalualoturPage(driver);
     calualoturPage.number6.click();
     calualoturPage.number4.click();
     calualoturPage.number3.click();
     calualoturPage.plucputton.click();
     calualoturPage.number2.click();
     calualoturPage.number8.click();
     calualoturPage.number8.click();
     calualoturPage.multibutton.click();
     calualoturPage.number9.click();
     calualoturPage.divisionbutton.click();
     calualoturPage.number6.click();
     calualoturPage.multibutton.click();
     calualoturPage.number2.click();
     calualoturPage.differentbutton.click();
     calualoturPage.number7.click();
     calualoturPage.number0.click();
     calualoturPage.percentbutton.click();
     calualoturPage.number5.click();
     calualoturPage.equalputton.click();

     Assert.assertEquals(calualoturPage.resulttext.getText(), "4");
     PageBases.captureScreenshot(driver,"completwo");

    }
}
