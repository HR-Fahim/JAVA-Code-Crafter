
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



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        int maxSum = Integer.MIN_VALUE; // Initialize with a large negative value
        
        int rows = arr.size();
        int columns = arr.get(0).size();
        
        for(int i=0;i<rows*columns;i++) {
        	
        	int row = i/columns;
        	int col = i%columns;
        	
        	if(row < 4 && col < 4) {
        		
        		int hourglassSum = arr.get(row).get(col) + arr.get(row).get(col + 1) + arr.get(row).get(col + 2)
                        + arr.get(row + 1).get(col + 1)
                        + arr.get(row + 2).get(col) + arr.get(row + 2).get(col + 1) + arr.get(row + 2).get(col + 2);

                maxSum = Math.max(maxSum, hourglassSum);
        	}
        }       
        
        System.out.println(maxSum);

        bufferedReader.close();
    }
}
