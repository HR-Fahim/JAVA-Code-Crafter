
import java.io.*;
import java.util.*;

public class StringEOF {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        //BufferedReader bufferreader = new BufferedReader(new InputStreamReader(System.in));
        //String[] str = bufferreader.readLine().replaceAll("\\s+$", "").split(" ");
                      
        int i = 1;
        
        Scanner in = new Scanner(System.in);
        
        while(true) {
        	if(in.hasNext()) {
            	
            	String str = in.nextLine();
            	
            	System.out.println(i+" "+str);
                i++;
                           
            }
        	else
        		break;
        }
    }
}
