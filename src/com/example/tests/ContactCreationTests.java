package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{

        @Test
        public void testNonEmptyContactCreation() throws Exception {
            app.navigationHelper.openMainPage();
            app.contactHelper.initContactCreation();
            ContactsData contact = new ContactsData();
            contact.setFirstname("name 1");
            contact.setLastname("last name 1");
            contact.setAddress("addr 1");
            contact.setHome("home 1");
            contact.setMobile("mobile 1");
            contact.setWork("work 1");
            contact.setEmail("email 1");
            contact.setEmail2("email2");
            contact.setBday("1");
            contact.setBmonth("May");
            contact.setByear("1992");
            contact.setGroup("это раз");
            contact.setAddress2("addr 2");
            contact.setPhone2("phone 1");
            app.contactHelper.fillContactForm(contact);
            app.contactHelper.submitContactCreation();
            app.contactHelper.returnToHomePage();
        }

        @Test
        public void testEmptyContactCreation() throws Exception {
            app.navigationHelper.openMainPage();
            app.contactHelper.initContactCreation();
            ContactsData contact = new ContactsData();
            contact.setFirstname("");
            contact.setLastname("");
            contact.setAddress("");
            contact.setHome("");
            contact.setMobile("");
            contact.setWork("");
            contact.setEmail("");
            contact.setEmail2("");
            contact.setBday("-");
            contact.setBmonth("-");
            contact.setByear("");
            contact.setGroup("");
            contact.setAddress2("");
            contact.setPhone2("");
            app.contactHelper.fillContactForm(contact);
            app.contactHelper.submitContactCreation();
            app.contactHelper.returnToHomePage();
        }


}


