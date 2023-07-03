
import java.io.*;
import java.util.*;
import org.apache.commons.lang3.StringUtils;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        System.out.println(A.length()+B.length());
        int x = A.compareTo(B);
        
        if(x>0){
            System.out.println("Yes");
        }
        else if(x<0){
            System.out.println("No");       
        }
        System.out.println(StringUtils.capitalize(A)+" "+StringUtils.capitalize(B));
    }
}



