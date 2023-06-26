
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class sum{
	public int sum(int[] ints){
		  
		  //sum the integers

		  //return the sum
		
		int sum = 0;
        
        // Calculating the sum of the elements in the array
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        //System.out.print(ints.length);
        return sum;
	}
}

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    	
    	sum n = new sum();
    	
    	
    	
    	Scanner input = new Scanner(System.in);
    	
    	String str = input.nextLine();
    	str = str.replaceAll("\\s", "");
    	//System.out.println(str.length());
    	int[] ints = new int[str.length()] ;
    	
    	for(int i = 0 ; i < str.length() ; i++) {
    		if(Character.isDigit(str.charAt(i))) {
    			ints[i] = Character.getNumericValue(str.charAt(i));
    			//System.out.println(ints[i]);
    		}
    		else {
    			System.out.print(str.charAt(i));
    		}
    	}
    	int x = n.sum(ints);
    	System.out.print(x);
    }
}
