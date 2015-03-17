package com.example.fm;

import com.example.tests.ContactsData;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ContactHelper extends HelperBase{
    public ContactHelper(ApplicationManager manager) {
        super(manager);
    }

    public void initContactCreation() {

        click(By.linkText("add new"));
    }

    public void fillContactForm(ContactsData contactsData) {

        type(By.name("firstname"), contactsData.getFirstname());
        type(By.name("lastname"), contactsData.getLastname());
        type(By.name("address"), contactsData.getAddress());
        type(By.name("home"), contactsData.getHome());
        type(By.name("mobile"), contactsData.getMobile());
        type(By.name("work"), contactsData.getWork());
        type(By.name("email"), contactsData.getEmail());
        type(By.name("email2"), contactsData.getEmail2());
        selectByText(By.name("bday"), contactsData.getBday());
        selectByText(By.name("bmonth"), contactsData.getBmonth());
        type(By.name("byear"), contactsData.getByear());
        //selectByText(By.name("new_group"), contactsData.getGroup());
        type(By.name("address2"), contactsData.getAddress2());
        type(By.name("phone2"), contactsData.getPhone2());

    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public void returnToHomePage() {
        click(By.linkText("home page"));
    }

    public void deleteContact() {

        click(By.xpath("//input[@value='Delete']"));
    }

    public void initContactModification(int index) {

        click(By.xpath("//img[@title='Edit']["+ index +"]"));
    }

    public void submitContactModification() {
        click(By.xpath("//input[@value='Update']"));
    }
}
