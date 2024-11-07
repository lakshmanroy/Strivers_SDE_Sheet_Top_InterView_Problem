import java.util.Arrays;

public class SortColor {
    public static void sortColor(int nums[]) {
        int start = 0;
        int mid = 0;
        int end = nums.length - 1;

        while (mid <= end) {
            if (nums[mid] == 0) {
                // Swap nums[start] and nums[mid]
                int temp = nums[start];
                nums[start] = nums[mid];
                nums[mid] = temp;
                
                start++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                // Swap nums[mid] and nums[end]
                int temp = nums[mid];
                nums[mid] = nums[end];
                nums[end] = temp;

                end--;
            }
        }
    }

    public static void main(String args[]) {
        int nums[] = {2, 0, 2, 1, 1, 0};

        sortColor(nums);

        System.out.println("Sorted array: " + Arrays.toString(nums));
    }
}
