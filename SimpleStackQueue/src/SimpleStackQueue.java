
import java.io.*;
import java.util.*;

public class SimpleStackQueue {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Stack<Character> stack = new Stack<Character>();
        Queue<Character> queue = new LinkedList<Character>();

        Scanner in = new Scanner(System.in);
        String s = in.next();

        boolean result = true;

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            stack.push(ch);
            queue.add(ch);
        }

        for(int i = 0; i < s.length(); i++) {
            if (stack.pop() != queue.poll()) {
                result = false;
                break;  // No need to continue checking if it's not a palindrome
            }
        }

        if (result) {
            System.out.println("The word, " + s + ", is a palindrome.");
        } else {
            System.out.println("The word, " + s + ", is not a palindrome.");
        }
    }
}

