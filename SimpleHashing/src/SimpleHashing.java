import java.util.HashMap;

public class SimpleHashing {
	public static void main(String[] args) {
		String str = "hello world";
// Create a HashMap to store frequency 2
		HashMap<Character, Integer> freqMap = new HashMap<>();
		for (char c : str.toCharArray()) {
			freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
		}
// Print the frequency of each character
		for (char c : freqMap.keySet()) {
			System.out.println(c + ": " + freqMap.get(c));
		}
	}
}