import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        
        // Sort the array to make it easier to avoid duplicates and use two pointers
        Arrays.sort(nums);
        int n = nums.length;
        
        // Traverse the array using two nested loops
        for (int i = 0; i < n - 3; i++) {
            // Skip duplicates for i
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            for (int j = i + 1; j < n - 2; j++) {
                // Skip duplicates for j
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                
                // Two-pointer approach for the remaining two elements
                int left = j + 1;
                int right = n - 1;
                
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        
                        // Move left and right to the next unique elements
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        FourSum  solution = new FourSum ();
        
        // Test case
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        
        // Call the fourSum method
        List<List<Integer>> result = solution.fourSum(nums, target);
        
        // Print the result
        System.out.println("Unique quadruplets that sum to target " + target + ":");
        for (List<Integer> quadruplet : result) {
            System.out.println(quadruplet);
        }
    }
}