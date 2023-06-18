import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     * 
     */
	
	static int temp_min;
	static int temp_max;
	static int count_min = 0;
	static int count_max = 0;
	
    public static void breakingRecords(List<Integer> scores) {
    	
    	// Convert ArrayList to Array
    	
    	int arr[] = new int [scores.size()];
    	
    	for(int i = 0 ; i < scores.size() ; i++){
    		arr[i] = scores.get(i);
    	}
    	
    	// Finding most max
    	
    	temp_max = arr[0];
    	
    	for(int j = 1 ; j < arr.length ; j++) {
    		
    		if(temp_max < arr[j]) {
    			temp_max = arr[j];
    			count_max++;
    		}
    	}
    	
    	System.out.print(count_max + " ");
    	
    	// Finding most min
    	
    	temp_min = arr[0];
    	
    	for(int j = 1 ; j < arr.length ; j++) {
    		
    		if(temp_min > arr[j]) {
    			temp_min = arr[j];
    			count_min++;
    		}
    	}
    	
    	System.out.print(count_min);

    }

}

public class BreakingRecords {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] scoresTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> scores = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresTemp[i]);
            scores.add(scoresItem);
        }
        
        // NOTE: No Array used for printing Answer
        
        Result.breakingRecords(scores);

        bufferedReader.close();
        
    }
}