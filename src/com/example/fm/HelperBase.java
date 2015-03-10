package com.example.fm;

import com.example.tests.GroupData;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public abstract class HelperBase {

    protected final WebDriver driver;
    protected ApplicationManager manager;
    public boolean acceptNextAlert = true;

    public HelperBase (ApplicationManager manager){

        this.manager = manager;
        this.driver = manager.driver;
    }

    public String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }

    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    protected void click(By locator) {
        driver.findElement(locator).click();
    }

    protected void type(By locator, String text) {
        if (text !=null){
            driver.findElement(locator).clear();
            driver.findElement(locator).sendKeys(text);
        }
    }

    protected void selectByText(By locator, String text) {
        if (text !=null){
            new Select(
                    driver.findElement(locator)).selectByVisibleText(text);
        }

    }
}
