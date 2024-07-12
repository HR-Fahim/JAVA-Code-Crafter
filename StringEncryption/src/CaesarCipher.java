import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
    // Write your code here
        s = s.replaceAll("^\"|\"$", "");
StringBuilder encrypted = new StringBuilder();
// int k = 5; // Assuming k = 5 as in the example provided
for (char ch : s.toCharArray()) {
    if (Character.isLetter(ch)) {
        if (Character.isLowerCase(ch)) {
            int shifted = (ch - 'a' + k) % 26;
            char encryptedChar = (char) ('a' + shifted);
            encrypted.append(encryptedChar);
        } else if (Character.isUpperCase(ch)) {
            int shifted = (ch - 'A' + k) % 26;
            char encryptedChar = (char) ('A' + shifted);
            encrypted.append(encryptedChar);
        }
    } else {
        // Non-letter characters remain unchanged
        encrypted.append(ch);
    }
}
return encrypted.toString();

    }

}

public class CaesarCipher {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
