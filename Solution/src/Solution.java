
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                String x=sc.next();
                //Complete this line
                
                System.out.print(s1);
                for(int j=s1.length();j<15;j++) {
                	System.out.print(" ");
                }
               if(x.length()<3) {
            	   for(int j=x.length();j<3;j++) {
            		   System.out.print("0");
            	   }
            	   System.out.println(x);
               }
               else {
            	   System.out.println(x);
               }
            }
            System.out.println("================================");

    }
}

