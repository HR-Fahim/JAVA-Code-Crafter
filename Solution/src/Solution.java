
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        int arr[] = new int[n] ;       
        
        for(int i=0;i<n;i++) {
        	arr[i] = input.nextInt();
        }
        
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
        	for(int j=0;j<arr.length;j++) {
        		int result = arr[i] - arr[j];
        		if(Math.abs(result)>max) {
        			max = result;
        		}
        	}
        }
        System.out.println(max);
    }
}