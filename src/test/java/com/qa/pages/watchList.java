package com.qa.pages;

import com.qa.CoreTest;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static com.qa.pages.relaunch.driver;

public class watchList extends CoreTest{

        @iOSXCUITFindBy(id = "NESN Original Shows")
        private WebElement NESNOriginal;
        @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"more   icon\"])[1]")
        private WebElement more;

       @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"NESN 360\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]")
       private WebElement addToWatchList;

        public watchList more() {
            more.click();
            return this;
        }
        public watchList addToWatchList() {
            addToWatchList.click();
            return this;
        }


}
