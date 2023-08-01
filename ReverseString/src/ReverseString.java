
public class ReverseString {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        
        // Using StringBuilder
        StringBuilder reversedStringBuilder = new StringBuilder(originalString);
        reversedStringBuilder.reverse();
        String reversedString1 = reversedStringBuilder.toString();

        // Using StringBuffer
        StringBuffer reversedStringBuffer = new StringBuffer(originalString);
        reversedStringBuffer.reverse();
        String reversedString2 = reversedStringBuffer.toString();
        
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String (Using StringBuilder): " + reversedString1);
        System.out.println("Reversed String (Using StringBuffer): " + reversedString2);
    }
}

