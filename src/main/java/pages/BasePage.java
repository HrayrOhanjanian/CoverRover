package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

public class BasePage {

    BasePage(){
        PageFactory.initElements(DriverFactory.getDriver(),this);
    }

    @FindBy(id = "asd")
    public WebElement asd;
}
