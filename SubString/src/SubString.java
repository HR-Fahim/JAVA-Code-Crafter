
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        System.out.println(S.subSequence(start, end));
        
        String h = "Hello";
        
        // Print prefix (Important) 
        
        System.out.println(h.substring(4-1));  // Output: lo
    }
}