package com.saucedemo.Pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By usernameField = By.id("user-name");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//input[@id='login-button']");
    By textProducts = By.xpath("//span[@class='title']");

    public void enterUsername(String userName) {
        sendTextToElement(usernameField, userName);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getTextProducts() {
        return getTextFromElement(textProducts);
    }


}
