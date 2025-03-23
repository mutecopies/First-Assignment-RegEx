import java.util.*;
import java.util.regex.*;

public class Exercises {

    // Validates an email address
    public boolean validateEmail(String email) {

        String regex = "^[a-zA-Z0-9][a-zA-Z0-9._%+-]*[a-zA-Z0-9]@[a-zA-Z0-9]+[a-zA-Z0-9.-]*[a-zA-Z0-9]\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
    // Finds a date in a string (British or American format)
    public String findDate(String string) {
        // todo
        String regex1 = "\\b(0?[1-9]|[12][0-9]|3[01])[-/](0?[1-9]|1[012])[-/](\\d{4})\\b";
        String regex2 = "\\b(\\d{4})[-/](0?[1-9]|1[012])[-/](0?[1-9]|[12][0-9]|3[01])\\b";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(string);
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(string);
        if (matcher1.find()) {
            return matcher1.group();
        }
        else if (matcher2.find()) {
            return matcher2.group();
        }
        else
            return null;
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
