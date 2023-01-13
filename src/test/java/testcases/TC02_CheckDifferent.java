package testcases;

import org.example.pages.P01_CalualoturPage;
import org.example.pages.PageBases;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02_CheckDifferent extends TestBases {
    P01_CalualoturPage calualoturPage;

    @Test(priority = 2, description = "check Different operation in the calculator")
    public void CheckDifferent() {
        calualoturPage = new P01_CalualoturPage(driver);
        calualoturPage.number1.click();
        calualoturPage.differentbutton.click();
        calualoturPage.number7.click();
        calualoturPage.equalputton.click();
        Assert.assertEquals(calualoturPage.resulttext.getText(), "-6");
        PageBases.captureScreenshot(driver,"differentresult");
    }
}
