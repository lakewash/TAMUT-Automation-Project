package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // ========================
    // LOCATORS
    // ========================

    // Search bar (top right)
    private By SEARCH_BAR = By.xpath("//input[@placeholder='Search…']");

    // Search button magnifying glass
    private By SEARCH_BUTTON = By.xpath("//button[contains(@class, 'search-button')]");

    // Alumni & Friends link
    private By ALUMNI_LINK = By.xpath("//a[contains(text(),'Alumni & Friends')]");

    // Visit Us link under menu
    private By VISIT_US_LINK = By.xpath("//a[contains(text(),'Visit Us')]");

    // ========================
    // VERIFICATION METHODS
    // ========================

    public boolean verifySearchBar() {
        return driver.findElement(SEARCH_BAR).isDisplayed();
    }

    public boolean verifySearchButton() {
        return driver.findElement(SEARCH_BUTTON).isDisplayed();
    }

    public boolean verifyAlumni() {
        return driver.findElement(ALUMNI_LINK).isDisplayed();
    }

    public boolean verifyVisitUs() {
        return driver.findElement(VISIT_US_LINK).isDisplayed();
    }

    // ========================
    // CLICK METHODS
    // ========================

    public void clickSearch() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(SEARCH_BUTTON));
        btn.click();
    }

    public void clickAlumni() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(ALUMNI_LINK));
        link.click();
    }

    public void clickVisitUs() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(VISIT_US_LINK));
        link.click();
    }
}
