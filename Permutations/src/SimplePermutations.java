import java.util.Arrays;

public class SimplePermutations {
    // Function to print permutations
    public static void permute(int[] nums, int start) {
        if (start == nums.length) {
            System.out.println(Arrays.toString(nums));  // Print the permutation
        } else {
            for (int i = start; i < nums.length; i++) {
                // Swap the elements
                int temp = nums[start];
                nums[start] = nums[i];
                nums[i] = temp;

                // Recursively generate permutations
                permute(nums, start + 1); 

                // Backtrack (swap back to restore the original array)
                temp = nums[start];
                nums[start] = nums[i];
                nums[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};  // Example numbers
        permute(nums, 0);  // Generate all permutations starting from index 0
    }
}
