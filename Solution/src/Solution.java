import java.util.ArrayList;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        List<Integer> a = List.of(0, 5, 3, 2, 4, 1, 6);
        ArrayList<Integer> arr = new ArrayList<>(a);
        Collections.sort(arr);
        int count = (int) arr.stream().mapToInt(Integer::intValue).count();
        int sum = arr.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum/count);
    }
}
