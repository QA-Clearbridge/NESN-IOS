package com.qa.pages;

import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.qa.pages.relaunch.driver;

public class bets {

    @iOSXCUITFindBy(id = "BETS")
    private WebElement betsIcon;

    @iOSXCUITFindBy(id = "AccountIconWhiteLine")
    private WebElement AccountIconWhiteLine;
    @iOSXCUITFindBy(id = "NESN Bets Content")
    private WebElement NESNBetContent;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"NESN 360\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeSwitch")
    private WebElement betSelect;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"NESN 360\"]/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSwitch")
    private WebElement betSelectAcc;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Back\"]")
    private WebElement betBack;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Done\"]")
    private WebElement done;

    public bets betsOn() {
        betsIcon.click();
        return this;
    }

    public bets done(){
        done.click();
        return this;
    }

    public bets betBack() {
        betBack.click();
        return this;
    }

    public bets betSelectAcc() {
        betSelectAcc.click();
        return this;
    }

    public bets accIconClick() {
        AccountIconWhiteLine.click();
        return this;
    }

    public bets betSelect() {
        betSelect.click();
        return this;
    }

    public bets NESNBets() {
        NESNBetContent.click();
        return this;
    }

}
