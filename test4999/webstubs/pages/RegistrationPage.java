package webstubs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static webstubs.frameworkUtils.Utils.*;

public class RegistrationPage extends BasePage {

    // Selectors for registration page elements
    private static final String REGISTER_HEADER = "#svelte > div.container-fluid > div.main.row > div.content > h1";
    private static final String REGISTER_USERNAME = "//*[@id=\"username\"]";
    private static final String REGISTER_PASSWORD = "//*[@id=\"password\"]";
    private static final String REGISTER_CONFIRM = "//*[@id=\"password2\"]";
    private static final String TITLE_BOX = "//*[@id=\"Mr\"]";
    public static final String FIRST_NAME = "//*[@id=\"input-first-name\"]";
    public static final String LAST_NAME = "//*[@id=\"input-last-name\"]";
    public static final String REGISTER_EMAIL = "//*[@id=\"input-email\"]";
    private static final String NATIONALITY = "//*[@id=\"input-nationality\"]";
    private static final String TERMS_CONDITIONS = "//*[@id=\"terms\"]";
    public static final String REGISTER_SUBMIT_BUTTON = "//*[@id=\"svelte\"]/div[1]/div[2]/div[2]/div/div/div/form/div[12]/button";
    private static final String DATE_OF_BIRTH = "//*[@id=\"input-dob\"]";

    private static final String REGISTER_STATIC_TEXT = "Sign up";

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public String getRegisterHeader() {
        return driver.findElement(By.cssSelector(REGISTER_HEADER)).getText();
    }

    public String getRegisterPageStatic() {
        return REGISTER_STATIC_TEXT;
    }

    public void register(String username, String password, String confirmPassword, String firstName, String lastName, String email, String dateofbirth) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(REGISTER_USERNAME))).sendKeys(username);
        driver.findElement(By.xpath(REGISTER_PASSWORD)).sendKeys(password);
        driver.findElement(By.xpath(REGISTER_CONFIRM)).sendKeys(confirmPassword);
        driver.findElement(By.xpath(FIRST_NAME)).sendKeys(firstName);
        driver.findElement(By.xpath(LAST_NAME)).sendKeys(lastName);
        driver.findElement(By.xpath(REGISTER_EMAIL)).sendKeys(email);

        scrollBy(driver, 0,1000);

        driver.findElement(By.xpath(TITLE_BOX)).click();
        driver.findElement(By.xpath(DATE_OF_BIRTH)).sendKeys(dateofbirth);

        driver.findElement(By.xpath(NATIONALITY)).click();
        //scrollToElement(driver, );
        driver.findElement(By.xpath(TERMS_CONDITIONS)).click();
        driver.findElement(By.xpath(REGISTER_SUBMIT_BUTTON)).click();

    }


}
