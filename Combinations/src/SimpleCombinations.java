import java.util.Arrays;

public class SimpleCombinations {
    // Function to print combinations
    public static void combine(int[] nums, int start, int k, int[] result, int index) {
        if (index == k) {
            System.out.println(Arrays.toString(result));  // Print the combination
            return;
        }

        for (int i = start; i < nums.length; i++) {
            result[index] = nums[i];  // Add the number to the combination
            combine(nums, i + 1, k, result, index + 1);  // Recursive call to select more elements
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};  // Example numbers
        int k = 2;  // Choose 2 elements 

        int[] result = new int[k];  // To store the current combination
        combine(nums, 0, k, result, 0);  // Generate combinations starting from index 0
    }
}
