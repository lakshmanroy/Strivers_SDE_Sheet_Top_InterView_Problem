import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();

        // Count occurrences of each element
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Collect elements that appear more than n / 3 times
        for (int num : countMap.keySet()) {
            if (countMap.get(num) > n / 3) {
                result.add(num);
            }
        }

        return result;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 2, 3};
        System.out.println(solution.majorityElement(nums)); // Expected output: [3]
    }
}
