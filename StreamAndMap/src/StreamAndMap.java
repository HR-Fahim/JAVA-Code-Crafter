import java.util.Arrays;
import java.util.HashSet;
import java.util.*;
import java.util.stream.Collectors;

public class StreamAndMap {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		String sentence = "Hello World";
		String[] words_example = sentence.split(" ");

		Arrays.stream(words_example).map(word -> word) // Identity function, no transformation
				.forEach(System.out::println);

		List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

		// ----------------------------------------------

		String message = "yourMessageHere";

		// Using Stream and Collectors.toSet() to create a HashSet of characters
		Set<Character> hs = message.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());

		// Display the HashSet
		System.out.println("HashSet: " + hs);

		// ----------------------------------------------

		String s = "Hello, World!";

		long count = s.chars().filter(ch -> ch != ' ') // Exclude spaces if needed
				.count();

		System.out.println("Total number of characters (excluding spaces): " + count);

		// ----------------------------------------------

		// Using a Stream to map each word to its length and collect them into a new
		// list

		// Stream Creation: numbers.stream() creates a stream from the list of numbers
		// Intermediate Operation: .map(n -> n * n) applies the lambda expression to
		// each number, transforming it into its square
		// Terminal Operation: .collect(Collectors.toList()) collects the transformed
		// elements into a new list

		List<Integer> lengths = words.stream().map(String::length).collect(Collectors.toList());

		System.out.println("Lengths of words: " + lengths);

		// ----------------------------------------------

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		// Using a Stream to map each number to its square and collect them into a new
		// list
		List<Integer> squares = numbers.stream().map(n -> n * n).collect(Collectors.toList());

		System.out.println("Squares of numbers: " + squares);

		// ----------------------------------------------

		String[] words_next = { "apple", "banana", "cherry" };

		Arrays.stream(words_next).map(String::toUpperCase).forEach(System.out::println);

		// ----------------------------------------------

		Set<Integer> numbers_next = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

		numbers.stream().map(n -> n * n).forEach(System.out::println);

		// ----------------------------------------------

		Map<String, Integer> map = new HashMap<>();
		map.put("apple", 1);
		map.put("banana", 2);
		map.put("cherry", 3);

		// Stream the keys
		map.keySet().stream().map(String::toUpperCase).forEach(System.out::println);

		// Stream the values
		map.values().stream().map(n -> n * n).forEach(System.out::println);

		// Stream the entries
		map.entrySet().stream().map(entry -> entry.getKey() + "=" + entry.getValue()).forEach(System.out::println);

		// ----------------------------------------------

		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1, "One");
		treeMap.put(2, "Two");
		treeMap.put(3, "Three");
		treeMap.put(4, "Four");
		treeMap.put(5, "Five");

		// Convert TreeMap entries to a list
		List<Map.Entry<Integer, String>> entryList = new ArrayList<>(treeMap.entrySet());
		
		// Calculate the middle index
		int middleIndex = entryList.size() / 2;

		// Get the middle entry
		Map.Entry<Integer, String> middleEntry = entryList.get(middleIndex);

		// Print the middle key and value
		System.out.println("Middle key: " + middleEntry.getKey());
		System.out.println("Middle value: " + middleEntry.getValue());

		// Iterate through the TreeMap and print entries where key equals value
		for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
			if (entry.getKey().equals(entry.getValue())) {
				System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
			}
		}
		
		// Max value
		treeMap.entrySet().stream().max(Map.Entry.comparingByValue()).ifPresent(entry -> System.out.println("Key with highest value: " + entry.getKey()));

	}
}
