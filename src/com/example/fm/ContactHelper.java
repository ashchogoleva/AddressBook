package com.example.fm;

import com.example.tests.ContactsData;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ContactHelper extends HelperBase{
    public ContactHelper(ApplicationManager manager) {
        super(manager);
    }

    public void initContactCreation() {
        driver.findElement(By.linkText("add new")).click();
    }

    public void fillContactForm(ContactsData contactsData) {
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys(contactsData.getFirstname());
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys(contactsData.getLastname());
        driver.findElement(By.name("address")).clear();
        driver.findElement(By.name("address")).sendKeys(contactsData.getAddress());
        driver.findElement(By.name("home")).clear();
        driver.findElement(By.name("home")).sendKeys(contactsData.getHome());
        driver.findElement(By.name("mobile")).clear();
        driver.findElement(By.name("mobile")).sendKeys(contactsData.getMobile());
        driver.findElement(By.name("work")).clear();
        driver.findElement(By.name("work")).sendKeys(contactsData.getWork());
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys(contactsData.getEmail());
        driver.findElement(By.name("email2")).clear();
        driver.findElement(By.name("email2")).sendKeys(contactsData.getEmail2());
        new Select(
                driver.findElement(By.name("bday"))).selectByVisibleText(contactsData.getBday());
        new Select(
                driver.findElement(By.name("bmonth"))).selectByVisibleText(contactsData.getBmonth());

        driver.findElement(By.name("byear")).clear();

        driver.findElement(By.name("byear")).sendKeys(contactsData.getByear());
        new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contactsData.getGroup());

        driver.findElement(By.name("address2")).clear();

        driver.findElement(By.name("address2")).sendKeys(contactsData.getAddress2());

        driver.findElement(By.name("phone2")).clear();

        driver.findElement(By.name("phone2")).sendKeys(contactsData.getPhone2());
    }

    public void submitContactCreation() {
        driver.findElement(By.name("submit")).click();
    }

    public void returnToHomePage() {
        driver.findElement(By.linkText("home page")).click();
    }
}
