import java.util.*;

public class Debugger
{
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Welcome");
        treeMap.put(2, "geeks");
        treeMap.put(3, "on");
        treeMap.put(4, "geeksforgeeks");

        // Get entries as a list
        Set<Map.Entry<Integer, String>> entrySet = treeMap.entrySet();
        List<Map.Entry<Integer, String>> entryList = new ArrayList<>(entrySet);

        // Print keys and values
        for (int i = 0; i < entryList.size(); i++) {
            System.out.println("Key at index " + i + ": " + entryList.get(i).getKey());
            System.out.println("Value at index " + i + ": " + entryList.get(i).getValue());
        }
    }
}
