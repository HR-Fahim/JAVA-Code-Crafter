
import java.io.*;
import java.util.*;

public class SimpleDataTypes {

    public static void main(String[] args) throws Exception
 {
    int i = 4;
   double d = 4.0;
   String s = "HackerRank ";


    Scanner scan = new Scanner(System.in);
        int a ;
        double b;
        String c;

        a=scan.nextInt();
        b=scan.nextDouble();
        scan.nextLine();
        c=scan.nextLine();
        System.out.println(i+a);
        System.out.println(d+b);
        System.out.println(s+c);
         scan.close();
}
}
