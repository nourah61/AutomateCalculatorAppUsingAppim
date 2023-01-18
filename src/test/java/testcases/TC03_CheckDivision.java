package testcases;

import org.example.pages.P01_CalculatorPage;
import org.example.pages.PageBases;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC03_CheckDivision extends TestBases {

    P01_CalculatorPage CalculatorPage;

    @Test(priority = 3, description = "check Division the calculator")
    public void CheckDivision() {
        CalculatorPage = new P01_CalculatorPage(driver);
        CalculatorPage.number1.click();
        CalculatorPage.divisionbutton.click();
        CalculatorPage.number7.click();
        CalculatorPage.equalputton.click();
        Assert.assertEquals(CalculatorPage.resulttext.getText(), "0.14285714285714285");
        PageBases.captureScreenshot(driver,"divisionresult");
}}
