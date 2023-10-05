package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {
    public static long getCountOfFreeEmails(List<String> emails) {
        return emails.stream()
                .filter(email -> isFreeDomain(email))
                .count();
    }

    private static boolean isFreeDomain (String email) {
        String[] splitEmail = email.split("@");
        switch (splitEmail[1]) {
            case "gmail.com":
            case "yandex.ru":
            case "hotmail.com":
                return true;
            default:
                return false;
        }
    }
}
// END
