package com.example.tests;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase{

    @Test
    public void testNonEmptyGroupCreation() throws Exception {
        app.navigationHelper.openMainPage();
        app.navigationHelper.gotoGroupsPage();
        app.groupHelper.initGroupCreation();
        GroupData group = new GroupData();
        group.setName("это раз");
        group.setHeader("это два");
        group.setFooter("это три");
        app.groupHelper.fillGroupForm(group);
        app.groupHelper.submitGroupCreation();
        app.groupHelper.returnToGroupsPage();
    }

    @Test
    public void testEmptyGroupCreation() throws Exception {
        app.navigationHelper.openMainPage();
        app.navigationHelper.gotoGroupsPage();
        app.groupHelper.initGroupCreation();
        app.groupHelper.fillGroupForm(new GroupData(" ", " ", " "));
        app.groupHelper.submitGroupCreation();
        app.groupHelper.returnToGroupsPage();
    }

}


