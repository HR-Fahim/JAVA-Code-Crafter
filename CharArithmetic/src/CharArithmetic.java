public class CharArithmetic {
    public static void main(String[] args) {
        char a = 'a'; // Character 'a'
        int asciiA = (int) a; // ASCII value of 'a'
        int offset = 'x' - 'a'; // Calculate the offset from 'a' to 'x'
        char x = (char) (asciiA + offset); // Calculate the character 'x' using the offset

        System.out.println("Character 'a': " + a);
        System.out.println("ASCII value of 'a': " + asciiA);
        System.out.println("Character 'x' using 'a' and its ASCII value: " + x);
    }
}
