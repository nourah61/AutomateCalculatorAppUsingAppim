package testcases;

import org.example.pages.P01_CalculatorPage;
import org.example.pages.PageBases;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC04_CheckMulti extends TestBases{

    P01_CalculatorPage CalculatorPage;

    @Test(priority = 4, description = "check multi in the calculator")
    public void CheckMuliti() {
        CalculatorPage = new P01_CalculatorPage(driver);
        CalculatorPage.number1.click();
        CalculatorPage.multibutton.click();
        CalculatorPage.number7.click();
        CalculatorPage.equalputton.click();
        Assert.assertEquals(CalculatorPage.resulttext.getText(), "7");
        PageBases.captureScreenshot(driver,"multiresult");

}}
