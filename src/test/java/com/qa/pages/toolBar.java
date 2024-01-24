package com.qa.pages;

import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.qa.pages.relaunch.driver;

public class toolBar {
    @iOSXCUITFindBy(id = "scores")
    private WebElement score;

    @iOSXCUITFindBy(id = "BETS")
    private WebElement bets;

    @iOSXCUITFindBy(id = "NEWS")
    private WebElement news;

    @iOSXCUITFindBy(id = "SCHEDULE")
    private WebElement schedule;

    public boolean score(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOf(score)).isDisplayed();
    }
    public boolean bets(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOf(bets)).isDisplayed();
    }
    public boolean news(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOf(news)).isDisplayed();
    }
    public boolean schedule(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOf(schedule)).isDisplayed();
    }

}
