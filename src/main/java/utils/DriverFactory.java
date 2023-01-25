package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.time.Duration;

public class DriverFactory {
    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();

    public static void initDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        driver.set(new ChromeDriver(chromeOptions));
        driver.get().manage().window().maximize();
        driver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    }

    public static WebDriver getDriver() {
        return driver.get();

    }

    public static void quiteDriver() {
        getDriver().quit();
    }

    public static void setImplicitWait(int second) {
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(second));
    }

    public static void setPageLoadTimeout(int second) {
        getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(second));
    }

    public static void goToUrl(String url) {
        getDriver().get(url);
    }
}
