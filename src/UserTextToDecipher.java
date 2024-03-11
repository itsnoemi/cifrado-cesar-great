import java.util.Scanner;

public class UserTextToDecipher {
    public static String userTextToDecipher() {
        Scanner s = new Scanner(System.in);
        String userTextToDecipher = s.nextLine();
        s.close();
        return userTextToDecipher;
    }
}
