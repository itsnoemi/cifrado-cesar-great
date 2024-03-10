import java.util.concurrent.ThreadLocalRandom;
public class RandomText {
    public static final int length = 452;
    public static final String allStrings = "abcdefghijklmnopqrstuvwxyz.,”:-!? ";
    public static String randomString = "";

    public static String randomText() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = randomNum(0, allStrings.length() - 1);
            char randomChar = allStrings.charAt(index);
            sb.append(randomChar);
        }
        randomString = sb.toString();
        return randomString;
    }

    private static int randomNum(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
