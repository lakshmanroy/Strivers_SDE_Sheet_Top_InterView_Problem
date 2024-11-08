
import java.util.Arrays;

public class MajorityElement {
    public static int majority(int nums[]){
        int n=nums.length;
        Arrays.sort(nums);
        return nums[n/2];
    }
    public static void main(String[] args) {
        int nums[]= {3,2,3};

        System.out.println(majority(nums));
    }
}
