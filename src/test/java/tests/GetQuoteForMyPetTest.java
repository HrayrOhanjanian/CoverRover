package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.GetQuoteForMyPetPage;
import utils.DataProviderData;
import utils.SeleniumActions;

public class GetQuoteForMyPetTest extends BasePageTest{

   // private GetQuoteForMyPetPage getQuoteForMyPetPage;
    SoftAssert softAssert;


    @BeforeMethod
   public void openPge(){
        softAssert = new SoftAssert();
        //getQuoteForMyPetPage = new GetQuoteForMyPetPage();
        navigateToURL();
    }

    // Check is required errors appears when user doesn't fill eny fill any field in first step
  /*@Test(dataProvider = "getDataForFirstStep", dataProviderClass = DataProviderData.class)
    public void firstStepRequiredMessages(String firstname, String lastname, String zip, String email, int requiredMessageCount, String wrongMessageCount) {
        GetQuoteForMyPetPage getQuoteForMyPetPage = new GetQuoteForMyPetPage();
        getQuoteForMyPetPage.clickAQuoteForMyPetBtb();
        getQuoteForMyPetPage.fillFirstStepFields(firstname, lastname, zip, email);
        softAssert.assertTrue(getQuoteForMyPetPage.requiredErrorMessageContEqual(requiredMessageCount),wrongMessageCount);
        softAssert.assertAll();
    }

    // Check is invalid email error message appear when user enters invalid email
    @Test(dataProvider = "getInvalidEmails", dataProviderClass = DataProviderData.class)
    public void emailFieldValidation(String email, String invalidEmailMessage) {
        GetQuoteForMyPetPage getQuoteForMyPetPage = new GetQuoteForMyPetPage();
        getQuoteForMyPetPage.clickAQuoteForMyPetBtb();
        getQuoteForMyPetPage.fillFirstStepNameLastNameZip();
        getQuoteForMyPetPage.fillEmailField(email);
        getQuoteForMyPetPage.clickNextStepButton();
        softAssert.assertTrue(getQuoteForMyPetPage.isInvalidEmailAppeared(), invalidEmailMessage);
        softAssert.assertAll();
    }

    // Check is zip code field can user enter symbols and characters
    @Test(dataProvider = "getInvalidZip", dataProviderClass = DataProviderData.class)
    void invalidZipCode(String zipCode, String invalidZip) {
        GetQuoteForMyPetPage getQuoteForMyPetPage = new GetQuoteForMyPetPage();
        getQuoteForMyPetPage.clickAQuoteForMyPetBtb();
        getQuoteForMyPetPage.fillZipCodeField(zipCode);
        getQuoteForMyPetPage.clickNextStepButton();
        softAssert.assertFalse(getQuoteForMyPetPage.isZipCodeValueContainsText(zipCode), invalidZip);
        softAssert.assertAll();
    }
*/
    // Check second step validation
    @Test
    void secondStepValidation() {
        GetQuoteForMyPetPage getQuoteForMyPetPage = new GetQuoteForMyPetPage();
        getQuoteForMyPetPage.clickAQuoteForMyPetBtb();
        getQuoteForMyPetPage.fillFirstStepFields("firstName","lastName","123", GetQuoteForMyPetPage.randomEmail);
        getQuoteForMyPetPage.clickOnAlmostBtn();
        softAssert.assertTrue(getQuoteForMyPetPage.requiredErrorMessageContEqual(2), "Required error message cont is wrong in 2nd step");
        softAssert.assertTrue(getQuoteForMyPetPage.selectOptionMessageCount(2), "Select option message cont is wrong in 2nd step");
        softAssert.assertAll();
    }

}
