
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'mostActive' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY customers as parameter.
     */

    public static List<String> mostActive(List<String> customers) {
    // Write your code here
    	
    	 HashMap<String, Integer> stringCounts = new HashMap<>();

         for (String str : customers) {
             if (stringCounts.containsKey(str)) {
                 int count = stringCounts.get(str);
                 stringCounts.put(str, count + 1);
             } else {
                 stringCounts.put(str, 1);
             }
         }

         int totalStrings = customers.size();

         Set<String> stringNames = new TreeSet<>();
         for (String str : stringCounts.keySet()) {
             int count = stringCounts.get(str);
             double percentage = (double) count / totalStrings * 100;
             if (percentage >= 5.0) {
                 stringNames.add(str);
             }
         }

         //System.out.println("String names with percentages >= 5% (in alphabetical order):");
         for (String str : stringNames) {
             System.out.println(str);
         }
    	return customers;

    }

}
public class ParcentageInList {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int customersCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> customers = IntStream.range(0, customersCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<String> result = Result.mostActive(customers);

//        bufferedWriter.write(
//            result.stream()
//                .collect(joining("\n"))
//            + "\n"
//        );

        bufferedReader.close();
        //bufferedWriter.close();
    }
}