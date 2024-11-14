package webstubs.tests;

import webstubs.pages.LoginPage;
import webstubs.pages.RegistrationPage;
import webstubs.tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NegativeRegisterTest extends BaseTest {

    @DataProvider(name = "NegativeRegistrationDataProvider")
    public Object[][] negativeRegistrationData() {
        return new Object[][]{
                {"", "Parola@123!", "Answer", "Email is required."},
                {"invalidEmail", "Parola@123!", "Answer", "Invalid email format."},
                {"alex@alex.com", "", "Answer", "Password is required."},
                {"alex@alex.com", "short", "Answer", "Password must be at least 8 characters."},
                {"alex@alex.com", "Parola@123!", "", "Security answer is required."}
        };
    }

    @Test(dataProvider = "NegativeRegistrationDataProvider")
    public void validateNegativeRegistration(String email, String password, String securityAnswer, String expectedErrorMessage) {
        driver.get(baseUrl + "/#/login");

        LoginPage lp = new LoginPage(driver);
        lp.awaitDismissModal();
        try {
            driver.findElement(By.cssSelector(".mat-snack-bar-container .mat-button")).click();
        } catch (NoSuchElementException ignored) {
            // Element not present, continue without further action
        }

        lp.newUser();
        RegistrationPage rp = new RegistrationPage(driver);                                                                             // Verify registration page

        Assert.assertEquals(rp.getRegisterHeader(), rp.getRegisterPageStatic(), "Incorrect registration page header.");        // Attempt registration with invalid data
        //rp.register(email, password, securityAnswer);                                                                                  // Retrieve the error message displayed

        WebElement errorMessageElement = driver.findElement(By.cssSelector(".error-message"));                                        // Replace with actual error message selector
        String actualErrorMessage = errorMessageElement.getText();                                                                   // Verify the error message matches the expected message
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message validation failed.");
    }
}
