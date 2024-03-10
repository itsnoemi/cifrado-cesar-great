import java.util.Scanner;

public class UserText {
    public static String userText() {
        Scanner s = new Scanner(System.in);
        String userText = s.nextLine();
        s.close();
        return userText;
    }
}
