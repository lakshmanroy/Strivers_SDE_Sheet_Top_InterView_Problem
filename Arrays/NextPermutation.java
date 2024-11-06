import java.util.Arrays;

public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // Step 1: Find the first decreasing element from the right
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: If we found such an element
        if (i >= 0) {
            int j = n - 1;
            // Find the smallest element greater than nums[i] to the right
            while (nums[j] <= nums[i]) {
                j--;
            }
            // Swap elements at i and j
            swap(nums, i, j);
        }

        // Step 3: Reverse the elements from i + 1 to the end of the array
        reverse(nums, i + 1, n - 1);
    }

    // Helper method to swap two elements in the array
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Helper method to reverse a portion of the array
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));  // Output: [1, 3, 2]
    }
}
