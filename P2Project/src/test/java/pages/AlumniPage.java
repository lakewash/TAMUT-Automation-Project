package pages;

import org.openqa.selenium.WebDriver;

public class AlumniPage {

    WebDriver driver;

    public AlumniPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean verifyAlumniPageLoaded() {
        return driver.getCurrentUrl().toLowerCase().contains("alumni");
    }
}
