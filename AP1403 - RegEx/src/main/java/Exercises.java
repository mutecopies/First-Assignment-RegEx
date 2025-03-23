import java.util.*;
import java.util.regex.*;

public class Exercises {

    // Validates an email address
    public boolean validateEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    // Finds a date in a string (British or American format)
    public String findDate(String string) {
        String regex = "\\b(\\d{4}-[01]\\d-[0-3]\\d|(?:0[1-9]|[12]\\d|3[01])/(?:0[1-9]|1[0-2])/(?:19|20)\\d{2})\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);

        return matcher.find() ? matcher.group() : null;
    }


    // Detects and counts valid passwords
    public int findValidPasswords(String string) {
        // todo
        String regex = "\\b(?=\\S*[A-Z])(?=\\S*[a-z])(?=\\S*\\d)(?=\\S*[!@#$%^&*])\\S{8,}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        int counter = 0;
//        while(matcher.find())
//        {
//            System.out.println(matcher.group());
//        }
        while (matcher.find()) {
            counter++;
        }
        return counter;
    }

    // Finds palindromic words (at least 3 letters, case insensitive)
    public List<String> findPalindromes(String string) {
        List<String> list = new ArrayList<>();
        String regex = "\\b[a-zA-Z]{3,}\\b";  // Matches words with at least 3 letters
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            String word = matcher.group();
            String reversed = new StringBuilder(word).reverse().toString();
            if (word.equalsIgnoreCase(reversed)) {
                list.add(word);
            }
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
