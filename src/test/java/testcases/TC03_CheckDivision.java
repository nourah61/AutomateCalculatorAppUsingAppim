package testcases;

import org.example.pages.P01_CalualoturPage;
import org.example.pages.PageBases;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC03_CheckDivision extends TestBases {

    P01_CalualoturPage calualoturPage;

    @Test(priority = 3, description = "check Division the calculator")
    public void CheckDivision() {
        calualoturPage = new P01_CalualoturPage(driver);
        calualoturPage.number1.click();
        calualoturPage.divisionbutton.click();
        calualoturPage.number7.click();
        calualoturPage.equalputton.click();
        Assert.assertEquals(calualoturPage.resulttext.getText(), "0.14285714285714285");
        PageBases.captureScreenshot(driver,"divisionresult");
}}
