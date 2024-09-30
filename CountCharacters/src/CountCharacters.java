import java.util.HashMap;
import java.util.Map;

public class CountCharacters {
	public static void main(String[] args) {
		String sentence = "Hello, World! How are you guys";

		// HashMap to store the count of each character
		Map<Character, Integer> charCountMap = new HashMap<>();

		// Loop through each character in the string
		for (char ch : sentence.toCharArray()) {
			// Update the count for each character using getOrDefault
			charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
		}

		// Print the count of each character
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
		}
	}
}
