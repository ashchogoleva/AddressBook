package com.example.tests;

import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {
    @Test

    public void deleteSomeContact(){
        app.getNavigationHelper().openMainPage();
        app.getContactHelper().initContactModification(1);

        ContactsData contact = new ContactsData();
        contact.setFirstname("new name");

        app.getContactHelper().fillContactForm(contact);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToHomePage();

    }
}
