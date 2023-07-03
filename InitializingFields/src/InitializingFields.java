
import java.util.*;

public class InitializingFields {

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            
            int B = in.nextInt();
            int H = in.nextInt();
            
            if (B > 0 && H > 0) {
                System.out.print(H);
            } else {
                System.out.print("java.lang.Exception: Breadth and height must be positive");
            }
        
    }
}