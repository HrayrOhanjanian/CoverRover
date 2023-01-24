package utils;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;


public class RandomUtils {
    private static Random random = new Random();
    public static int randomInt = random.nextInt(10000);

    public static String randomString (int lengthOfString) {
        return RandomStringUtils.randomAlphabetic(lengthOfString).toLowerCase();
    }
}
