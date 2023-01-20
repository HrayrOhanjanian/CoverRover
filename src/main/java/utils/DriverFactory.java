package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.time.Duration;

public class DriverFactory {
    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();

    public static void initDriver(String browser) {
        switch (browser){
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                WebDriverManager.chromedriver().setup();
                driver.set(new ChromeDriver(chromeOptions));
                driver.get().manage().window().maximize();
                //DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
                break;
            case "firefox":
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                WebDriverManager.firefoxdriver().setup();
                driver.set(new FirefoxDriver(firefoxOptions));
                driver.get().manage().window().maximize();
                break;
        }
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
        getDriver().navigate().to(url);
    }
}
