package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.VisitUsPage;

public class VisitUsPageTest extends TestBase {

    @Test
    public void openVisitUsPage() {
        HomePage home = new HomePage(driver);
        home.clickVisitUs();

        VisitUsPage visits = new VisitUsPage(driver);
        Assert.assertTrue(visits.verifyVisitUsPageLoaded(), "Visit Us page NOT opened!");
    }
}
