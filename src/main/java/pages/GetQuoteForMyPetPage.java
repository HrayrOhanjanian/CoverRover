package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ElementFunctions;
import utils.RandomUtils;
import utils.SeleniumActions;
import utils.Waiters;

import java.util.List;

public class GetQuoteForMyPetPage extends BasePage{

    public static String  baseUrl = "https://www.coverrover.com/";
    public static String  randomEmail = RandomUtils.randomString(5) + "@mailinator.com";


    @FindBy (xpath = "(//*[contains(text(),'Get a free quote now')])[1]")
    public WebElement getAQuoteForMyPetBtb;

    @FindBy (xpath = "//*[@alt=\"dogAndCat\"]")
    public WebElement petLogo;

    @FindBy (name = "firstName")
    public WebElement firstNameField;

    @FindBy (name = "lastName")
    public WebElement lastNameField;

    @FindBy (name = "zip")
    public WebElement zipCodeField;

    @FindBy (name = "email")
    public WebElement emailField;

    @FindBy (xpath = "//*[contains(text(),'Next step!')]")
    public WebElement nextStepButton;

    @FindBy (xpath = "//*[contains(text(),'This is a required field.')]")
    public List<WebElement> requiredErrorMessageList;

    @FindBy (xpath = "//*[contains(text(),'Please enter a valid email')]")
    public WebElement invalidEmailErrorMessage;

    @FindBy (name = "name")
    public WebElement petNameField;

    @FindBy (xpath = "//*[contains(text(),'Select an option')]")
    public List<WebElement> selectOptionErrorMessagelist;

    @FindBy (xpath = "//*[@for=\"1\"]")
    public WebElement dogCheckbox;

    @FindBy (xpath = "//*[@for=\"2\"]")
    public WebElement catCheckbox;

    @FindBy (xpath = "//*[@for=\"3\"]")
    public WebElement maleCheckbox;

    @FindBy (xpath = "//*[@for=\"4\"]")
    public WebElement feMaleCheckbox;

    @FindBy (name = "age")
    public WebElement nameFiled;

    @FindBy (xpath = "//*[contains(text(),'Almost there!')]")
    public WebElement almostThereBtn;

    @FindBy (xpath = "//*[contains(text(),'Previous step')]")
    public WebElement previousStepBtn;

    @FindBy (name = "breed_type")
    public WebElement breedTypeSelect;

    @FindBy (name = "breed")
    public WebElement bredSelect;

    @FindBy (xpath = "//*[contains(text(),'Go Fetch!')]")
    public WebElement goFetchBtn;

    @FindBy (xpath = "//*[contains(text(),'Great News')]")
    public WebElement successMessage;


    public void  clickAQuoteForMyPetBtb() {
        SeleniumActions.clickOnElement(getAQuoteForMyPetBtb);
    }
    public void clickNextStepButton() {
        SeleniumActions.clickOnElement(nextStepButton);
    }

    public boolean requiredErrorMessageContEqual(int count) {
        return requiredErrorMessageList.size() == count;
    }

    public boolean selectOptionMessageCount(int count) {
        return selectOptionErrorMessagelist.size() == count;
    }

    public void fillFirstStepFields(String firstname, String lastname, String zip, String email) {
        SeleniumActions.typeTextOnElement(firstNameField, firstname);
        SeleniumActions.typeTextOnElement(lastNameField, lastname);
        SeleniumActions.typeTextOnElement(zipCodeField, zip);
        SeleniumActions.typeTextOnElement(emailField, email);
        SeleniumActions.clickOnElement(nextStepButton);
    }
    String firstName = RandomUtils.randomString(5);
    String  lastName = RandomUtils.randomString(5);
    String zip = "123";
    public void fillFirstStepNameLastNameZip(){
        SeleniumActions.typeTextOnElement(firstNameField, firstName);
        SeleniumActions.typeTextOnElement(lastNameField, lastName);
        SeleniumActions.typeTextOnElement(zipCodeField, zip);
    }

    public void fillEmailField(String email) {
        SeleniumActions.typeTextOnElement(emailField, email);
    }

    public boolean isInvalidEmailAppeared() {
        return ElementFunctions.isElementDisplayed(invalidEmailErrorMessage);
    }


    public void fillZipCodeField(String zipCode) {
        SeleniumActions.typeTextOnElement(zipCodeField, zipCode);
    }
    public boolean isZipCodeValueContainsText(String valueOfZipCOdeField) {
        return ElementFunctions.isAttributeValueEqualsToExpected(zipCodeField, "value", valueOfZipCOdeField);
    }

    public void clickOnAlmostBtn () {
        SeleniumActions.clickOnElement(almostThereBtn);
    }

    private String petName = "Elvis";
    public void fillPetName() {
        SeleniumActions.typeTextOnElement(petNameField, petName);
    }
 }
