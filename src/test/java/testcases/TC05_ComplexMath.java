package testcases;

import org.example.pages.P01_CalualoturPage;
import org.example.pages.PageBases;
import org.testng.Assert;
import org.testng.annotations.Test;

import static testcases.TestBases.driver;

public class TC05_ComplexMath  extends TestBases{

    P01_CalualoturPage calualoturPage;

    @Test(priority = 5, description = "check complex math in the calculator")
    public void Complex() {
        calualoturPage = new P01_CalualoturPage(driver);
        calualoturPage.number6.click();
        calualoturPage.number6.click();
        calualoturPage.number8.click();
        calualoturPage.plucputton.click();
        calualoturPage.number1.click();
        calualoturPage.number5.click();
        calualoturPage.number6.click();
        calualoturPage.divisionbutton.click();
        calualoturPage.number6.click();
        calualoturPage.number7.click();
        calualoturPage.differentbutton.click();
        calualoturPage.number1.click();
        calualoturPage.number1.click();
        calualoturPage.number8.click();
        calualoturPage.plucputton.click();
        calualoturPage.number2.click();
        calualoturPage.number0.click();
        calualoturPage.number0.click();
        calualoturPage.multibutton.click();
        calualoturPage.number5.click();
        calualoturPage.number7.click();
        calualoturPage.number0.click();
        calualoturPage.percentbutton.click();
        calualoturPage.number7.click();
        calualoturPage.equalputton.click();


        Assert.assertEquals(calualoturPage.resulttext.getText(), "2.5897435897495598");
        PageBases.captureScreenshot(driver,"complexsult");

}}
