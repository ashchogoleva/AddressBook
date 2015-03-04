package com.example.fm;

import com.example.tests.GroupData;
import org.openqa.selenium.By;

public class GroupHelper extends HelperBase {
    public GroupHelper(ApplicationManager manager) {
        super(manager);
    }

    public void initGroupCreation() {
        driver.findElement(By.name("new")).click();
    }

    public void fillGroupForm(GroupData groupData) {
        driver.findElement(By.name("group_name")).clear();
        driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
        driver.findElement(By.name("group_header")).clear();
        driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
        driver.findElement(By.name("group_footer")).clear();
        driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    public void returnToGroupsPage() {

        driver.findElement(By.linkText("group page")).click();
    }

    public void submitGroupCreation() {

        driver.findElement(By.name("submit")).click();
    }
}