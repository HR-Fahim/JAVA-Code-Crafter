import java.io.*;
import java.util.*;

public class BufferedReaderExamples {
    public static void main(String[] args) throws IOException {
        // Create a BufferedReader to read from the standard input
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        // Read the input string
        String input = bufferedReader.readLine().trim();
        
        // Remove the surrounding quotes from the string if present
        if (input.startsWith("\"") && input.endsWith("\"")) {
            input = input.substring(1, input.length() - 1);
        }
        
        // Split the input string by commas to get each directory path
        String[] dirs = input.split("\",\"");

        // Remove any leading or trailing quotes from the individual elements
        for (int i = 0; i < dirs.length; i++) {
            dirs[i] = dirs[i].replaceAll("^\"|\"$", "");
        }

        // Create an ArrayList and add the directory paths
        List<String> directoryList = new ArrayList<>(Arrays.asList(dirs));

        // Iterate through the ArrayList and check each directory path
        for (String dir : directoryList) {
            // Example checks on each directory path
            if (dir.equals("./")) {
                System.out.println("Current directory: " + dir);
            } else if (dir.equals("../")) {
                System.out.println("Parent directory: " + dir);
            } else {
                System.out.println("Sub-directory: " + dir);
            }
        }

        // Close the BufferedReader
        bufferedReader.close();
    }
}
