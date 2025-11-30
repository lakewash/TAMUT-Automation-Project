package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends TestBase {

    @Test
    public void verifyHomeLinks() {

        HomePage home = new HomePage(driver);

        Assert.assertTrue(home.verifySearchBar(), "Search bar NOT visible!");
        Assert.assertTrue(home.verifyAlumni(), "Alumni & Friends NOT visible!");
        Assert.assertTrue(home.verifyVisitUs(), "Visit Us NOT visible!");
    }
}
