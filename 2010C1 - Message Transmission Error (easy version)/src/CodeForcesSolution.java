import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CodeForcesSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String message = bufferedReader.readLine();

        if (message == null || message.isEmpty()) {
            System.out.println("NO");
            return;
        }

        double length = message.length();

        TreeMap<String, Integer> hm = new TreeMap<>();

        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < i; j++) {
                String substring = message.substring(j, i);
                hm.put(substring, hm.getOrDefault(substring, 0) + 1);
            }
        }

        String key = hm.entrySet().stream()
                .filter(entry -> entry.getValue() == 2)
                .max(Comparator.comparingInt(entry -> entry.getKey().length()))
                .map(Map.Entry::getKey)
                .orElse(null);

        if (key == null) {
            System.out.println("NO");
            return;
        }

        boolean flag = false;

        for (int i = 1; i < key.length(); i++) {
            if (key.substring(0, i).equals(key.substring(key.length() - i))) {
                if (message.startsWith(key) && message.endsWith(key)) {
                    flag = true;
                }
            }
        }

        if (flag) {
            System.out.println("YES");
            System.out.println(key);
        } else {
            System.out.println("NO");
        }
    }
}
