import java.util.*;

public class SolutionHOME {
	public static void main(String[] args) {
		
		String message = "Hello";
		
		int len = message.length();
		int middle = message.length()/2;
		
		System.out.println(message.substring(0, len));
		
		System.out.println(message.substring(0, middle));
		System.out.println(message.substring(middle));
		
		System.out.println(message.substring(0, middle).charAt(middle - 1));
		System.out.println(message.substring(middle).charAt(0));
	}
}
