import java.util.*;
import java.util.regex.*;

public class HTML {

    public static void countTagCharacters(String html) {
        // Map to store the count for each tag
        Map<String, Integer> tagCount = new HashMap<>();

        // Regex pattern to match opening tag, content, and closing tag
        Pattern pattern = Pattern.compile("<([a-z0-9]+)>(.*?)</\\1>", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(html);

        // Loop through all matches
        while (matcher.find()) {
            String tag = matcher.group(1);
//            System.out.println(tag);
            String content = matcher.group(2).replaceAll("\\s+", ""); // Remove spaces
            
            // Update the tag count
            tagCount.put(tag, tagCount.getOrDefault(tag, 0) + content.length());
        }

        // Print tags and their counts in lexicographical order
        tagCount.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> {
                    if (entry.getValue() > 0) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                });
    }

    public static void main(String[] args) {
        String html = "<div>hello world</div><div>foo</div><span>bar</span>";
        countTagCharacters(html);
    }
}
