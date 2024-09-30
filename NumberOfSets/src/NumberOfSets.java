import java.util.ArrayList;
import java.util.List;

public class NumberOfSets {

    public static void findSets(int n, List<Integer> currentSet) {
        if (n == 0) {
            System.out.println(currentSet);
            return;
        }

        for (int i = 1; i <= Math.min(4, n); i++) {
            currentSet.add(i);
            findSets(n - i, currentSet); // pause
            currentSet.remove(currentSet.size() - 1); // backtrack (will start from next because of n-1)
        }
    }

    public static void main(String[] args) {
        int width = 3;
        findSets(width, new ArrayList<>());
    }
}
