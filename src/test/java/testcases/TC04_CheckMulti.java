package testcases;

import org.example.pages.P01_CalualoturPage;
import org.example.pages.PageBases;
import org.testng.Assert;
import org.testng.annotations.Test;

import static testcases.TestBases.driver;

public class TC04_CheckMulti extends TestBases{

    P01_CalualoturPage calualoturPage;

    @Test(priority = 4, description = "check multi in the calculator")
    public void CheckMuliti() {
        calualoturPage = new P01_CalualoturPage(driver);
        calualoturPage.number1.click();
        calualoturPage.multibutton.click();
        calualoturPage.number7.click();
        calualoturPage.equalputton.click();
        Assert.assertEquals(calualoturPage.resulttext.getText(), "7");
        PageBases.captureScreenshot(driver,"multiresult");

}}
