package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.AlumniPage;

public class AlumniPageTest extends TestBase {

    @Test
    public void openAlumniPage() {

        HomePage home = new HomePage(driver);
        home.clickAlumni();   // CLICK WORKS NOW

        AlumniPage alumni = new AlumniPage(driver);
        Assert.assertTrue(alumni.verifyAlumniPageLoaded(), "Alumni page NOT loaded!");
    }
}
