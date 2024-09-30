import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        // Create a Map where the key is an Integer and the value is a List of Integers
        Map<Integer, List<Integer>> map = new HashMap<>();

        // Add elements to the map
        map.put(1, Arrays.asList(10, 20, 30));
        map.put(2, Arrays.asList(40, 50, 60));
        map.put(3, Arrays.asList(70, 80, 90));

        // Iterate through the map
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            Integer key = entry.getKey();
            List<Integer> values = entry.getValue();
            
            System.out.println("Key: " + key);
            System.out.println("Values: " + values);
        }
    }
}
