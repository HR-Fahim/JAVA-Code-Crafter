import java.util.HashMap;
import java.util.Map;

public class EntryAndEntrySet {
	public static void main(String[] args) {

		// Create a HashMap and populate it with some data
		HashMap<String, Integer> items = new HashMap<>();
		items.put("Apple", 50);
		items.put("Banana", 30);
		items.put("Cherry", 20);

		// Use entrySet() to get a set view of the map's entries
		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			// Access the key and value from each entry
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("Item: " + key + ", Quantity: " + value);
		}

		// ----------------------------------------------

		String sentence = "Hello, World!";

		// HashMap to store the count of each character
		Map<Character, Integer> charCountMap = new HashMap<>();

		// Loop through each character in the string
		for (char ch : sentence.toCharArray()) {
			// Update the count for each character using getOrDefault
			charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
		}
		
		System.out.println(charCountMap.entrySet());

		// Print the count of each character using streams
		charCountMap.entrySet().stream().map(entry -> "Character: " + entry.getKey() + ", Count: " + entry.getValue())
				.forEach(System.out::println);
	}
}
