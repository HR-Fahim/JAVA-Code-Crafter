
import java.util.ArrayList;
import java.util.Scanner;

public class SplitByLine {
    public static void main(String[] args) {
        ArrayList<String> inputList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter multiple lines of text (press Enter after each line, and type 'done' to finish):");

        String line;
        while (true) {
            line = scanner.nextLine();
            if (line.equals("done")) {
                break;
            }
            inputList.add(line);
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (String input : inputList) {
            stringBuilder.append(input).append("\n");
        }
        String finalInput = stringBuilder.toString().trim();

        System.out.println("Final input with newlines:");
        System.out.println(finalInput);
    }
}

