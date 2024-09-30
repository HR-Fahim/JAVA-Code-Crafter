import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialCharacters {
    public static void main(String[] args) {
        String text = "Hello, World! This is a test sentence with special characters: @#$%^&*()_+123.";

        // Removing all special characters
        String cleanedText = text.replaceAll("[^a-zA-Z0-9\\s]", "");
        System.out.println("Cleaned Text (all special characters removed): " + cleanedText);
        
       // Removing all special characters
        String noSpace = text.replaceAll("\\s+", "");
        System.out.println("Cleaned Text (all space between characters removed): " + noSpace);

        // Removing specific special characters: @, #, $, %, ^, &, *, (, ), _, +
        String specificCleanedText = text.replaceAll("[@#$%^&*()_+]", "");
        System.out.println("Cleaned Text (specific special characters removed): " + specificCleanedText);

        // Example 1: Finding all words
        Pattern wordPattern = Pattern.compile("\\b\\w+\\b");
        Matcher wordMatcher = wordPattern.matcher(text);
        System.out.println("\nWords in the text:");
        while (wordMatcher.find()) {
            System.out.println(wordMatcher.group());
        }

        // Example 2: Finding all digits
        Pattern digitPattern = Pattern.compile("\\d+");
        Matcher digitMatcher = digitPattern.matcher(text);
        System.out.println("\nDigits in the text:");
        while (digitMatcher.find()) {
            System.out.println(digitMatcher.group());
        }

        // Example 3: Validating an email address
        String email = "example@example.com";
        String emailRegex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,6}$";
        boolean isEmailValid = Pattern.matches(emailRegex, email);
        System.out.println("\nIs the email valid? " + isEmailValid);

        // Example 4: Validating a phone number
        String phone = "123-456-7890";
        String phoneRegex = "^\\d{3}-\\d{3}-\\d{4}$";
        boolean isPhoneValid = Pattern.matches(phoneRegex, phone);
        System.out.println("Is the phone number valid? " + isPhoneValid);

        // Example 5: Finding all occurrences of a word
        String wordToFind = "test";
        Pattern findPattern = Pattern.compile(wordToFind);
        Matcher findMatcher = findPattern.matcher(text);
        System.out.println("\nOccurrences of the word 'test':");
        while (findMatcher.find()) {
            System.out.println("Found at index: " + findMatcher.start());
        }

        // Example 6: Splitting a string based on a pattern
        String csv = "apple,banana,cherry,date";
        String[] fruits = csv.split(",");
        System.out.println("\nFruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
