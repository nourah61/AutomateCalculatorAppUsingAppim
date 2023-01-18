package testcases;

import org.example.pages.P01_CalculatorPage;
import org.example.pages.PageBases;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC05_ComplexMath  extends TestBases{

    P01_CalculatorPage CalculatorPage;

    @Test(priority = 5, description = "check complex math in the calculator")
    public void Complex() {
        CalculatorPage = new P01_CalculatorPage(driver);
        CalculatorPage.number6.click();
        CalculatorPage.number6.click();
        CalculatorPage.number8.click();
        CalculatorPage.plucputton.click();
        CalculatorPage.number1.click();
        CalculatorPage.number5.click();
        CalculatorPage.number6.click();
        CalculatorPage.divisionbutton.click();
        CalculatorPage.number6.click();
        CalculatorPage.number7.click();
        CalculatorPage.differentbutton.click();
        CalculatorPage.number1.click();
        CalculatorPage.number1.click();
        CalculatorPage.number8.click();
        CalculatorPage.plucputton.click();
        CalculatorPage.number2.click();
        CalculatorPage.number0.click();
        CalculatorPage.number0.click();
        CalculatorPage.multibutton.click();
        CalculatorPage.number5.click();
        CalculatorPage.number7.click();
        CalculatorPage.number0.click();
        CalculatorPage.percentbutton.click();
        CalculatorPage.number7.click();
        CalculatorPage.equalputton.click();


        Assert.assertEquals(CalculatorPage.resulttext.getText(), "2.5897435897495598");
        PageBases.captureScreenshot(driver,"complexsult");

}}
