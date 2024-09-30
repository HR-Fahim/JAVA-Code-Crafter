import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import java.util.function.Predicate;
import java.util.*;

public class RegEx {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("Visit W3Schools!");
		boolean matchFound = matcher.find();
		if (matchFound) {
			System.out.println("Match found");
//			System.out.println(matcher.group());
		} else {
			System.out.println("Match not found");
		}

		// ----------------------------------------------

		String regex = "\\d+"; // Regular expression to match one or more digits
		String input = "hello12345";

		// Using Pattern.matches
		boolean isMatch1 = Pattern.matches(regex, input); 
		System.out.println("Using Pattern.matches: " + isMatch1);  // False

		// Equivalent to
		Pattern pattern1 = Pattern.compile(regex);
		boolean isMatch2 = pattern1.matcher(input).matches();
		System.out.println("Using Pattern.compile and matcher: " + isMatch2);

		// ----------------------------------------------

		// Creating a pattern for a simple date format: YYYY-MM-DD
		Pattern datePattern = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");

		// Getting the match predicate from the pattern
		Predicate<String> dateMatcher = datePattern.asMatchPredicate();

		// Creating a stream of date strings and filtering them using the match
		// predicate
		Stream.of("2023-09-27", "12-34-5678", "2021-05-15", "abcd-efgh-ijkl").filter(dateMatcher)
				.forEach(System.out::println);

		// ----------------------------------------------

		List<String> emails = Arrays.asList("ram123@gmail.com", "javatpoint@gmail.com", "abc342@gmailcom",
				"seeta342@gm12ail.com", "xy.z111@gmail.com");

		// Creating a pattern to match email addresses ending with @gmail.com
		Pattern emailPattern = Pattern.compile("^(.+)@gmail.com");

		// Filtering the list using the pattern's asPredicate method
		emails.stream().filter(emailPattern.asPredicate()).forEach(System.out::println);
	}
}