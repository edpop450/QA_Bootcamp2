package webstubs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    // Update the CSS selector to match the new layout of the main page
    private static final String ALL_PRODUCTS_SELECTOR = "div.products-header > h1"; // Adjusted CSS selector for "All Products" text

    private static final String ALL_PRODUCTS_TEXT = "All Products";

    @FindBy(css = ALL_PRODUCTS_SELECTOR)
    WebElement products;

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getProductsText() {
        return products.getText();
    }

    public String getProductsStaticText() {
        return ALL_PRODUCTS_TEXT;
    }
}
