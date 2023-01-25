package tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.GetQuoteForMyPetPage;
import utils.DriverFactory;
import utils.ScreenShot;
import utils.SeleniumActions;

public class BasePageTest {
    private final String MAIN_URL = GetQuoteForMyPetPage.baseUrl;

    public void navigateToURL(String path) {
        DriverFactory.goToUrl(MAIN_URL + path);
    }

    public void navigateToURL() {
        DriverFactory.goToUrl(MAIN_URL);
    }
    @BeforeMethod
    void setup() {
        DriverFactory.initDriver();
        SeleniumActions.setActions();
    }

    /*@AfterMethod
    void makeScreenScreenShotIfFails(ITestResult result){
        if (result.getStatus() == ITestResult.FAILURE) {
            ScreenShot.makeScreenShot(result.getName());
        }
    }*/
    @AfterMethod(alwaysRun = true)
    void tearDown() {
        DriverFactory.quiteDriver();
        SeleniumActions.removeActions();
    }
}
