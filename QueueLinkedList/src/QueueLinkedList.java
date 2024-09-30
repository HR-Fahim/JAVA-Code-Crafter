import java.io.*;
import java.util.*;

public class QueueLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        for(int i = 0; i < n; i++) {
            int operation = in.nextInt();
            switch(operation) {
                case 1:
                    list.add(in.nextInt());
                    break;
                case 2:
                    if (!list.isEmpty()) {
                        list.removeFirst();  // remove the first inserted element
                    }
                    break;
                case 3:
                    if (!list.isEmpty()) {
                        System.out.println(list.peekFirst());  // print the first inserted element
                    }
                    break;
                default:
                    break;
            }
        }
        
        in.close();
    }
}
