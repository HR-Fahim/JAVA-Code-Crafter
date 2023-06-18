import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    
    int x = arr.size();
        double count_positive = 0;
        double count_negative = 0;
        double count_zero = 0;
        
        for (int i = 0; i < x; i++) {
            if(arr.get(i)>0) {
                count_positive++;
            }
            else if(arr.get(i)<0) {
                count_negative++;
            }
            else {
                count_zero++;
            }
        }
        System.out.println(count_positive/x);
        System.out.println(count_negative/x);
        System.out.println(count_zero/x);

    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
