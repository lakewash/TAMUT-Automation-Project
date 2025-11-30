package pages;

import org.openqa.selenium.WebDriver;

public class VisitUsPage {

    WebDriver driver;

    public VisitUsPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean verifyVisitUsPageLoaded() {
        return driver.getCurrentUrl().toLowerCase().contains("visit");
    }
}
