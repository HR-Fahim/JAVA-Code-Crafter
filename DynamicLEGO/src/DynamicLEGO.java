import java.io.*;
import java.util.*;

class Result {

	private static final long MOD = 1_000_000_007;

	public static int legoBlocks(int n, int m) {
	    if (n == 1) {
	        // For height 1, return 1 if width < 5, otherwise 0
	        return m < 5 ? 1 : 0;
	    }
	    
	    // Array to store the number of ways to fill a row of width i
	    long[] rowWays = new long[m + 1];
	    
	    // Calculate the number of ways to fill a single row of width i
	    for (int i = 1; i <= m; i++) {
	        if (i < 5) {
	            rowWays[i] = 1;
	            for (int j = i - 1; j >= 1; j--) {
	                rowWays[i] += rowWays[j];
	                rowWays[i] %= MOD;
	            }
	        } else {
	            rowWays[i] = (rowWays[i - 1] + rowWays[i - 2] + rowWays[i - 3] + rowWays[i - 4]) % MOD;
	        }
	    }
	    
	    // Array to store total number of valid configurations for width i
	    long[] totalConfigurations = new long[m + 1];
	    
	    // Calculate the total number of configurations for a wall of height n and width i
	    for (int i = 1; i <= m; i++) {
	        totalConfigurations[i] = 1;
	        for (int j = 1; j <= n; j++) {
	            totalConfigurations[i] = (totalConfigurations[i] * rowWays[i]) % MOD;
	        }
	    }
	    
	    // Arrays to store the number of good and bad configurations
	    long[] goodConfigurations = new long[m + 1];
	    long[] badConfigurations = new long[m + 1];
	    
	    // Base cases
	    goodConfigurations[1] = 1;
	    badConfigurations[1] = 0;
	    
	    // Calculate the number of good configurations
	    for (int i = 2; i <= m; i++) {
	        badConfigurations[i] = 0;
	        for (int j = 1; j < i; j++) {
	            badConfigurations[i] = (badConfigurations[i] + goodConfigurations[j] * totalConfigurations[i - j]) % MOD;
	        }
	        goodConfigurations[i] = (totalConfigurations[i] - badConfigurations[i] + MOD) % MOD;
	    }
	    
	    // Return the number of good configurations for width m
	    return (int) goodConfigurations[m];
	}

}

public class DynamicLEGO {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int n = Integer.parseInt(firstMultipleInput[0]);
            int m = Integer.parseInt(firstMultipleInput[1]);

            int result = Result.legoBlocks(n, m);

//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
        }

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
