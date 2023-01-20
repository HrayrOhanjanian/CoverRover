package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Waiters {
    private static WebDriverWait wait;

    private static void setWait(int second) {
        wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(second));
    }

    public static boolean waitForVisibilityElement(WebElement element, int second) {
        setWait(second);
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public static boolean waitForClickableElement(WebElement element, int second) {
        setWait(second);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public static boolean waitForInvisibility(WebElement element, int second) {
        setWait(second);
        try {
            wait.until(ExpectedConditions.invisibilityOf(element));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public static boolean waitForVisibilityAllElements(List<WebElement> listName, int second) {
        setWait(second);
        try {
            wait.until(ExpectedConditions.visibilityOfAllElements(listName));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public static boolean waitForInVisibilityAllElements(List<WebElement> listName, int second) {
        setWait(second);
        try {
            wait.until(ExpectedConditions.invisibilityOfAllElements(listName));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public static boolean waitTabCountToBe(int countOfTab, int second) {
        setWait(second);
        try {
            wait.until(ExpectedConditions.numberOfWindowsToBe(countOfTab));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }


    public static boolean waitURLContains(String url, int second) {
        setWait(second);
        try {
            wait.until(ExpectedConditions.urlContains(url));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

   public static void waitJsLoad() {
        setWait(20);
        JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getDriver();
        wait.until(d -> (Boolean) js.executeScript("return document.readyState").toString().equals("complete"));
   }
}
