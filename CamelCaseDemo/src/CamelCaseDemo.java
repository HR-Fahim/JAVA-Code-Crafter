import org.apache.commons.lang3.StringUtils;

public class CamelCaseDemo {
    public static void main(String[] args) {
        String input = "C;M;white sheet of paper";
        String camelCase = toCamelCase(input);

        System.out.println(camelCase); // Output: HelloWorld
    }

    public static String toCamelCase(String input) {
        String[] words = StringUtils.split(input);
        StringBuilder camelCase = new StringBuilder();

        for (String word : words) {
            camelCase.append(StringUtils.capitalize(word.toLowerCase()));
        }

        return camelCase.toString();
    }
}
