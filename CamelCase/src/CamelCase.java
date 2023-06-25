
/* Here's a breakdown of the regular expression:

   [ ]: Defines a character class.
   \\(: Matches the open parenthesis character.
   \\): Matches the close parenthesis character.
   \\s: Matches any whitespace character (space, tab, newline).
   +: Matches one or more occurrences of the characters in the character class.
   The replaceAll() method replaces all occurrences of brackets and white spaces with an 

   .replaceAll("\\s+", "") removes all " "
   .replaceAll("[()]", "") remove all brackets using regular expression
   .replaceAll("\\s+|!", "") remove spaces and skip '!' symbol using regular expression
   .replaceAll("[^a-zA-Z0-9_]+", "") remove spaces and symbols using regular expression
   .replaceAll("[\\s,\\.]+", "") remove spaces, commas, and periods using regular expression
   .replaceAll("[\\(\\)\\[\\]\\{\\}\\s]+", "") remove brackets and white spaces using regular expression
   .replaceAll("[\\(\\)\\[\\]]", "") remove brackets

   StringBuilder spacedWord = new StringBuilder(); // Creating StringBuilder Object
   spacedWord.append(" "); // Append a space before letters 
   spacedWord.append(str.charAt(i)); // Append the current character 
   String result = spacedWord.toString(); // Append convert & print
   System.out.println(result); 
   spacedWord.deleteCharAt(x); // To remove char from a word 
   
   Pattern pattern = Pattern.compile("[{}()\\[\\]]"); // Creating Pattern Object
   pattern.matcher(string).replaceAll(""); */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CamelCase {

	public static void main(String[] args) {

		//ArrayList<String> inputList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String str;

		while (true) {

			str = scanner.nextLine();

			str.toUpperCase().charAt(0);
			str.toUpperCase().charAt(2);

			// SMClass SM = new SMClass(str);
			// CVClass CV = new CVClass(str);
			// CCClass CC = new CCClass(str);
			// SCClass SC = new SCClass(str);
			// CMClass CM = new CMClass(str);
			// SVClass SV = new SVClass(str);

			if (str.charAt(0) == 'S' && str.charAt(2) == 'M') {
				SMClass SM = new SMClass(str);
			} else if (str.charAt(0) == 'C' && str.charAt(2) == 'V') {
				CVClass CV = new CVClass(str);
			} else if (str.charAt(0) == 'C' && str.charAt(2) == 'C') {
				CCClass CC = new CCClass(str);
			} else if (str.charAt(0) == 'S' && str.charAt(2) == 'C') {
				SCClass SC = new SCClass(str);
			} else if (str.charAt(0) == 'C' && str.charAt(2) == 'M') {
				CMClass CM = new CMClass(str);
			}
		}

	}
}