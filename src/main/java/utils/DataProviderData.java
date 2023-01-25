package utils;

import org.testng.annotations.DataProvider;
import pages.GetQuoteForMyPetPage;

public class DataProviderData {

    String  randomEmail = GetQuoteForMyPetPage.randomEmail;

    @DataProvider(name = "getDataForFirstStep")
    public Object[][] getData() {
        Object[][] data = {
                {"", "", "", "", 4, "required message count is wrong when user without filling clicks on the next step button"},
                {"", "lastname", "123", randomEmail, 1,"required message count is wrong when user without filling firstname click on the next step button"},
                {"firstname", "", "123", randomEmail, 1, "required message count is wrong when user without filling lastname click on the next step button"},
                {"firstname", "lastname", "", randomEmail, 1,"required message count is wrong when user without filling zip click on the next step button"},
                {"firstname", "lastname", "123", "", 1, "required message count is wrong when user without filling email click on the next step button"},
                {"firstname", "", "", "", 3, "required message count is wrong when user enters only firstname click on the next step button"},
                {"", "lastname", "", "", 3, "required message count is wrong when user enters only lastname click on the next step button"},
                {"", "", "123", "", 3,"required message count is wrong when user enters only zip click on the next step button"},
                {"", "", "", randomEmail, 3, "required message count is wrong when user enters only email click on the next step button"},
                {"firstname", "lastname", "", "", 2, "required message count is wrong when user enters firstname and lastname click on the next step button"},
                {"firstname", "", "123", "", 2, "required message count is wrong when user enters firstname and zip click on the next step button"},
                {"firstname", "", "", randomEmail, 2, "required message count is wrong when user enters firstname and email click on the next step button"},
                {"", "", "123", randomEmail, 2, "required message count is wrong when user enters zip and email click on the next step button"}};
        return data;
    }

    @DataProvider(name = "getInvalidEmails")
    public Object[][] getEmail() {
        Object[][] invalidEmails = {
                {"test test", "missing @ and domain"},
                {"!@#$%^&*()-@gmail.com", "Domain with only symbols"},
                {"@gmail.com", "Missing User"},
                {"test.gmail.com", "Missing @"},
                {"test@test@gmail.com", "with 2 @"},
                {".test@gmail.com", "in th first of email is dot"},
                {"test..test@gmail.com", "multiple dots"},
                {"test@gmail", "missing top-level domain"},
        };
        return invalidEmails;
    }

    @DataProvider(name = "getInvalidZip")
    public Object[][] getZipCode() {
        Object[][] invalidZips = {
                {"Donald Trump", "zip code with characters"},
                {"!@#$%^&*()_+", "zipcode with symbols"},
                {"123456789", "zip code which length is more than 5"},
        };
        return invalidZips;
    }

}
