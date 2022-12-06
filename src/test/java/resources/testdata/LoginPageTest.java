package resources.testdata;

import com.saucedemo.Pages.LoginPage;
import com.saucedemo.Pages.ProductOnPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    ProductOnPage productOnPage = new ProductOnPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        String expectedText = "PRODUCTS";
        Assert.assertEquals(loginPage.getTextProducts(), expectedText, "PRODUCTS");
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        productOnPage.usernameField1("standard_user");
        productOnPage.passwordField1("secret_sauce");
        productOnPage.clickOnLoginButton1();
        int actualNumber = productOnPage.sixProducts();
        int expectedNumber = 6;
        Assert.assertEquals(expectedNumber, actualNumber);
    }
}
