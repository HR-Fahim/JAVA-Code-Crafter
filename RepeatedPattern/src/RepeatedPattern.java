import java.util.HashMap;
import java.util.Map;

public class RepeatedPattern {

    public static Map<String, Integer> findRepeatedPatterns(String s) {
        Map<String, Integer> patternCount = new HashMap<>();
        int maxLen = s.length();

        // Iterate over all possible substring lengths
        for (int length = 1; length < maxLen; length++) {
            for (int i = 0; i <= maxLen - length; i++) {
                String substring = s.substring(i, i + length);

                // Count occurrences of each substring
                patternCount.put(substring, patternCount.getOrDefault(substring, 0) + 1);
            }
        }

        // Filter patterns that occurred more than once
        Map<String, Integer> repeatedPatterns = new HashMap<>();
        for (Map.Entry<String, Integer> entry : patternCount.entrySet()) {
            if (entry.getValue() > 1) {
                repeatedPatterns.put(entry.getKey(), entry.getValue());
            }
        }

        return repeatedPatterns;
    }

    public static void main(String[] args) {
        String s = "abab";
        Map<String, Integer> result = findRepeatedPatterns(s);

        // Output the repeated patterns
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println("Pattern: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }
}
