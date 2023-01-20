package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot {
    public static void makeScreenShot(String imageName) {
        try {
            TakesScreenshot ts = (ChromeDriver)DriverFactory.getDriver();
            File file = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File("./ScreenShots/" + RandomUtils.randomInt + imageName + ".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
