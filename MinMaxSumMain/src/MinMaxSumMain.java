import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * 
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     * 
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    	long max = 0;
    	long min = 0;
    	
    	// To sort arr in reverse order
    	Collections.sort(arr,Collections.reverseOrder());
    	
    	/* 
    	 * To find directly min
    	 * Integer min = arr.stream().min(Comparator.naturalOrder()).get();
    	 
    	 * Calculate the sum of all numbers using stream and reduce
         * int sum = numbers.stream().reduce(0, Integer::sum);
         * 
    	 */
        
        for(int i = 1 ; i < arr.size() ; i++) {
            min+=arr.get(i);            
        }
        System.out.print(min+" ");
        
        for(int i = 0 ; i < arr.size()-1 ; i++) {
            max+=arr.get(i);            
        }
        System.out.print(max+" ");    	
    }
}

public class MinMaxSumMain {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
