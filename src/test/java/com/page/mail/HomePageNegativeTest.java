package com.page.mail;

import com.page.HomeMailPage;
import com.page.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePageNegativeTest extends TestBase {


    @Test(priority = 1)
    public void negativeTextEmail(){
        homeMailPage.clickLoginTextBox();
        homeMailPage.inputLoginInTextBoxMail("");
        homeMailPage.clickLoginButton();
        Assert.assertTrue(homeMailPage.isError());
    }

    @Test(priority = 2)
    public void negativePasswordEmail() {
        homeMailPage.inputLoginInTextBoxMail("kod.kryshitel");
        homeMailPage.clickLoginButton();
        visibilityLocatedElementWaiter(By.name("password"), 10);
        homeMailPage.inputPasswordInTextBoxMail("");
        homeMailPage.clickLoginButton();
        Assert.assertTrue(homeMailPage.isError());
    }




}
