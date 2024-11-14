package webstubs.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import webstubs.pages.LoginPage;
import webstubs.pages.LoginPagePF;

import java.time.Duration;

public class LoginTest extends BaseTest {


    @Test
    public void login01() {
        driver.get(baseUrl + "#");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement topRightCorner = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#svelte > div.container-fluid > div.header.sticky-top.row > div:nth-child(2) > div > a > h2 > i"))); // replace with actual CSS selector
        topRightCorner.click();
        LoginPage lp = new LoginPage(driver);
        lp.awaitDismissModal();
        lp.login("zebra", "zebrapassword");
    }
}