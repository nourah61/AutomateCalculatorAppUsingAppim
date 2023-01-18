package testcases;

import org.example.pages.P01_CalculatorPage;
import org.example.pages.PageBases;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02_CheckDifferent extends TestBases {
    P01_CalculatorPage CalculatorPage;

    @Test(priority = 2, description = "check Different operation in the calculator")
    public void CheckDifferent() {
        CalculatorPage = new P01_CalculatorPage(driver);
        CalculatorPage.number1.click();
        CalculatorPage.differentbutton.click();
        CalculatorPage.number7.click();
        CalculatorPage.equalputton.click();
        Assert.assertEquals(CalculatorPage.resulttext.getText(), "-6");
        PageBases.captureScreenshot(driver,"differentresult");
    }
}
