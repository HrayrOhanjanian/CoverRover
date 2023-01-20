package utils;

import org.openqa.selenium.WebElement;

public class ElementFunctions {

    public static boolean isElementDisplayed(WebElement element) {
        Waiters.waitForVisibilityElement(element,5);
        return element.isDisplayed();
    }

    public static boolean isElementEnabled(WebElement element) {
        Waiters.waitForVisibilityElement(element,5);
        return element.isEnabled();
    }

    public static boolean isAttributeValueEqualsToExpected(WebElement element, String attributeName, String value) {
        Waiters.waitForVisibilityElement(element,5);
        return element.getAttribute(attributeName).equals(value);
    }

    public static boolean isElementTextEqualsToExpected(WebElement element, String expectedText) {
        Waiters.waitForVisibilityElement(element, 5);
        return element.getText().equals(expectedText);
    }

    public static boolean isElementContainsText(WebElement element, String text) {
        Waiters.waitForVisibilityElement(element,5);
        return element.getText().contains(text);
    }

    public static boolean isElementSelected(WebElement element) {
        Waiters.waitForVisibilityElement(element, 5);
        return element.isSelected();
    }
}
