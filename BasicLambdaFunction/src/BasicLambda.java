
import java.util.*;

public class BasicLambda {

	interface StringFunction {
	    String apply(String str);
	}

	public static void main(String[] args) {
		StringFunction exclaim = s -> s + "!";
		StringFunction ask = s -> s + "?";

		System.out.println(exclaim.apply("Hello")); // Output: Hello!
		System.out.println(ask.apply("How are you")); // Output: How are you?
	}
}
