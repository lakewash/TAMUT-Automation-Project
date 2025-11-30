package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;

public class SearchPageTest extends TestBase {

    @Test
    public void verifySearchPage() {

        HomePage home = new HomePage(driver);
        home.clickSearch();

        SearchPage search = new SearchPage(driver);

        Assert.assertTrue(search.verifySearchBar(), "Search bar NOT visible!");
        Assert.assertTrue(search.verifySearchButton(), "Search button NOT visible!");

        search.typeKeyword("Admissions");
        search.clickSearchButton();
    }
}
