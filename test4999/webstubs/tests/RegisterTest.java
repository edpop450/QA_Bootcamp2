package webstubs.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import webstubs.pages.RegistrationPage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import static webstubs.frameworkUtils.Utils.scrollBy;

public class RegisterTest extends BaseTest {

    @DataProvider(name = "RegistrationDataProvider")
    public Iterator<Object[]> registerDp() {
        Collection<Object[]> dp = new ArrayList<>();
        dp.add(new String[]{"alex12", "Alex98876%", "Alex98876%", "Alex", "Gatu", "alex@alex.com","12152001"});
        return dp.iterator();
    }

    @Test(dataProvider = "RegistrationDataProvider")
    public void loginRegister2(String username, String password, String confirmPassword, String firstName, String lastName, String email, String dateofbirth) {
        driver.get(baseUrl + "/#/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement signIn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"svelte\"]/div[1]/div[1]/div[2]/div/a/h2/i")));
        signIn.click();

        WebElement hereButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"svelte\"]/div[1]/div[2]/div[2]/p[2]/div/a")));
        hereButton.click();



        RegistrationPage rp = new RegistrationPage(driver);
        rp.register(username, password, confirmPassword, firstName, lastName, email, dateofbirth);

    }
}
