public class ReaptingAndMissing {
    public static int[] findDuplicateAndMissing(int[] nums) {
        int duplicate = -1;
        int missing = -1;
        
        // Marking the visited numbers by negating the value at their respective indices
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;  // Find the index
            
            // Check if the number at this index is already negative
            if (nums[index] < 0) {
                duplicate = Math.abs(nums[i]);  // Found the duplicate
            } else {
                nums[index] = -nums[index];  // Mark the number as visited by negating
            }
        }
        
        // Find the missing number (index with positive value)
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                missing = i + 1;  // Missing number found
                break;
            }
        }
        return new int[]{duplicate, missing};
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 5, 3};
        int[] result = findDuplicateAndMissing(nums);
        System.out.println("Duplicate: " + result[0] + ", Missing: " + result[1]);
    }
}