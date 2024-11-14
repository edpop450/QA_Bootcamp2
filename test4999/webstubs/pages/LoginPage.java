package webstubs.pages;

import webstubs.frameworkUtils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.NoSuchElementException;

public class LoginPage extends BasePage {

    // Update these selectors to match the new page structure
    private static final String LOGIN_TEXT_SELECTOR = "#svelte > div.container-fluid > div.main.row > div.content > h1";
    private static final String USERNAME_SELECTOR = "//*[@id=\"user\"]";
    private static final String PASSWORD_SELECTOR = "//*[@id=\"pass\"]";
    public static final String SUBMIT_SELECTOR = "//*[@id=\"svelte\"]/div[1]/div[2]/div[2]/div/div/div/form/button";
    public static final String REMEMBER_ME = "//*[@id=\"remember\"]";
    private static final String NOT_REGISTER_SELECTOR = "#svelte > div.container-fluid > div.main.row > div.content > p:nth-child(3) > div > a";
    private static final String MODAL_SELECTOR = "#svelte > div.container-fluid > div.main.row > div.content > div > div > div > form > button";

    private static final String LOGIN_TEXT_VALUE = "Sign in";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {

        WebElement emailField = driver.findElement(By.xpath(USERNAME_SELECTOR));
        WebElement passwordField = driver.findElement(By.xpath(PASSWORD_SELECTOR));
        WebElement loginText = driver.findElement(By.cssSelector(LOGIN_TEXT_SELECTOR));

        // Validate the presence of the login text
        Assert.assertEquals(loginText.getText(), LOGIN_TEXT_VALUE, "Login header text mismatch.");

        emailField.clear();
        emailField.sendKeys(username);
        passwordField.clear();
        passwordField.sendKeys(password);

        WebElement rememberButton = driver.findElement(By.xpath(REMEMBER_ME));
        rememberButton.click();

        WebElement submitButton = driver.findElement(By.xpath(SUBMIT_SELECTOR));
        submitButton.click();
    }

    public void dismissModal() {
        // Attempt to dismiss the modal if present
        try {
            WebElement modalElement = driver.findElement(By.cssSelector(MODAL_SELECTOR));
            modalElement.click();
        } catch (NoSuchElementException ignored) {
            // Modal not present, no action needed
        }
    }

    public void awaitDismissModal() {
        // Wait for the modal and dismiss if found
        Utils.waitForElement(driver, 3, By.cssSelector(MODAL_SELECTOR)).click();
    }

    public void newUser() {
        // Navigate to the registration page via "Not registered?" link
        WebElement newUserLink = driver.findElement(By.cssSelector(NOT_REGISTER_SELECTOR));
        newUserLink.click();
    }
}
