
import java.io.*;
import java.util.*;

public class HashtableSample {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	Hashtable <String, Integer> ht = new Hashtable<>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            ht.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(ht.containsKey(s)) {
            	System.out.println(s+"="+ht.get(s));
            }
            else {
            	System.out.println("Not found");
            }
        }
        in.close();
    }
}