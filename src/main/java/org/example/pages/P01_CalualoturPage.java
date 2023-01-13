package org.example.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P01_CalualoturPage {

    public  P01_CalualoturPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@index='14']")
    public WebElement number1;

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


}
