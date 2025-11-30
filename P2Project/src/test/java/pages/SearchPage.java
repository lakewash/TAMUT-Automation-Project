package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    // Search bar + button locators
    private By SEARCH_FIELD = By.xpath("//input[@placeholder='Search...']");
    private By SEARCH_BUTTON = By.xpath("//button[contains(@class,'search-button')]");

    // Verify search field is visible
    public boolean verifySearchBar() {
        return driver.findElement(SEARCH_FIELD).isDisplayed();
    }

    // Verify search button exists (basic check)
    public boolean verifySearchButton() {
        return driver.findElement(SEARCH_BUTTON).isDisplayed();
    }

    // TYPE INTO SEARCH BAR
    public void typeKeyword(String keyword) {
        driver.findElement(SEARCH_FIELD).sendKeys(keyword);
    }

    // CLICK SEARCH BUTTON
    public void clickSearchButton() {
        driver.findElement(SEARCH_BUTTON).click();
    }
}
