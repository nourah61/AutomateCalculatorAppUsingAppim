package org.example.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P01_CalculatorPage {

    public P01_CalculatorPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@index='14']")
    public WebElement number1;  //class & index

    @AndroidFindBy(xpath = "//android.widget.Button[@index='6']")
    public WebElement number7;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='17']")
    public WebElement plucputton;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='20']")
    public WebElement equalputton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index='0']")
    public WebElement resulttext;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='13']")
    public WebElement differentbutton;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='5']")
    public WebElement divisionbutton;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='9']")
    public WebElement multibutton ;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='12']")
    public WebElement number6;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='7']")
    public WebElement number8;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='11']")
    public WebElement number5;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='15']")
    public WebElement number2;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='18']")
    public WebElement number0;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='4']")
    public WebElement percentbutton;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='10']")
    public WebElement number4;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='16']")
    public WebElement number3;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='8']")
    public WebElement number9;









}
