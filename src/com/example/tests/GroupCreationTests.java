package com.example.tests;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase{

    @Test
    public void testNonEmptyGroupCreation() throws Exception {
        app.openMainPage();
        app.gotoGroupsPage();
        app.initGroupCreation();
        GroupData group = new GroupData();
        group.setName("это раз");
        group.setHeader("это два");
        group.setFooter("это три");
        app.fillGroupForm(group);
        app.submitGroupCreation();
        app.returnToGroupsPage();
    }

    @Test
    public void testEmptyGroupCreation() throws Exception {
        app.openMainPage();
        app.gotoGroupsPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData(" ", " ", " "));
        app.submitGroupCreation();
        app.returnToGroupsPage();
    }

}


