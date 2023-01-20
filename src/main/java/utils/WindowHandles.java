package utils;

import java.util.ArrayList;
import java.util.Set;

public class WindowHandles {

    private static Set<String> windowHandles;
    public static void navigateToTabByIndex(int index, int countOfTabToWait)  {
        windowHandles = DriverFactory.getDriver().getWindowHandles();
        ArrayList<String> window = new ArrayList<>(windowHandles);
        Waiters.waitTabCountToBe(countOfTabToWait,5);
        DriverFactory.getDriver().switchTo().window(window.get(index));
    }
}
