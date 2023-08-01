
import java.util.ArrayList;
import java.util.Scanner;

public class SubStringInFunction {

    public static String getSmallestAndLargest(String s, int k) {
               
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        ArrayList<String> arr = new ArrayList<String>();
        
        for(int i=0;i<=s.length()-k;i++) {
        	arr.add(s.substring(i,i+k));        	
        }
        arr.sort(null);
        
        String smallest = arr.get(0);
        String largest = arr.get(arr.size()-1);
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
