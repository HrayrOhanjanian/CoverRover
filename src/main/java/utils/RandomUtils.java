package utils;

import org.apache.commons.lang3.RandomStringUtils;


public class RandomUtils {
    public static long randomInt = (long) (Math.random() * 10000);

    public static String randomString (int lengthOfString) {
        return RandomStringUtils.randomAlphabetic(lengthOfString).toLowerCase();
    }
}
