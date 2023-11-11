import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	Stack<Character> stack = new Stack<Character>();
    	Queue<Character> queue = new LinkedList<Character>();
    	
    	Scanner in = new Scanner(System.in);
    	String s = in.next();
    	
    	boolean result = true;
    	
    	for(int i=0;i<s.length();i++) {
    		stack.push(s.charAt(i));
    		queue.add(s.charAt(i));
    	}
    	
    	for(int i=0;i<s.length();i++) {
    		if(stack.pop() == queue.poll()) {
    			result = true;
    		}
    		else {
    			result = false;
    		}
    	}
    	
    	if(result) {
			System.out.println("The word, "+s+", is a palindrome.");
		}
		else {
			System.out.println("The word, "+s+", is not a palindrome.");
		}
    }
}