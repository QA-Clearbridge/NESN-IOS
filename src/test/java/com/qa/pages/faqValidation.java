package com.qa.pages;

import com.qa.CoreTest;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class faqValidation  extends CoreTest {

    @iOSXCUITFindBy(id = "FAQ")
    private WebElement FAQ;

//    public faqValidation faq() {
//        FAQ.click();
//        swipe(driver);
//        closeApp();
//        return this;
//    }

    public boolean isFAQLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOf(FAQ)).isDisplayed();
    }
}
