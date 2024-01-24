package com.qa.pages;

import com.qa.CoreTest;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.By.id;


public class Signup extends CoreTest {
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Create Account\"]")
    private WebElement createAccount;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"NESN 360\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    private WebElement firstName;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"NESN 360\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextField")
    private WebElement emailTxtField;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"NESN 360\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeSecureTextField")
    private WebElement passwordText;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Let’s Go!\"]")
    private WebElement letsGo;


    public Signup passwordText(String psw) {
        sendKeys(passwordText,psw);
        return this;
    }

    public Signup firstName(String fName) {
        sendKeys(firstName,fName);
        return this;
    }

    public Signup emailTextField(String emailNew) {
        sendKeys(emailTxtField,emailNew);
        return this;
    }

    public Signup createAccount() {
        createAccount.click();
        return this;
    }

    public Signup letsGo() {
        letsGo.click();
        return this;
    }

}
