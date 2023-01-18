package testcases;

import org.example.pages.P01_CalculatorPage;
import org.example.pages.PageBases;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC06_ComplexTwo extends TestBases {

    P01_CalculatorPage CalculatorPage;

    @Test(priority = 6, description = "check another complex math in the calculator")
    public void ComplexTwo() {
     CalculatorPage = new P01_CalculatorPage(driver);
     CalculatorPage.number6.click();
     CalculatorPage.number4.click();
     CalculatorPage.number3.click();
     CalculatorPage.plucputton.click();
     CalculatorPage.number2.click();
     CalculatorPage.number8.click();
     CalculatorPage.number8.click();
     CalculatorPage.multibutton.click();
     CalculatorPage.number9.click();
     CalculatorPage.divisionbutton.click();
     CalculatorPage.number6.click();
     CalculatorPage.multibutton.click();
     CalculatorPage.number2.click();
     CalculatorPage.differentbutton.click();
     CalculatorPage.number7.click();
     CalculatorPage.number0.click();
     CalculatorPage.percentbutton.click();
     CalculatorPage.number5.click();
     CalculatorPage.equalputton.click();

     Assert.assertEquals(CalculatorPage.resulttext.getText(), "4");
     PageBases.captureScreenshot(driver,"completwo");

    }
}
