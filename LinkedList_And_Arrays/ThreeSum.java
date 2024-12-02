// package LinkedList_And_Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>>threeSum(int nums[]){
        List<List<Integer>>res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int total=nums[i]+nums[j]+nums[k];
                if(total>0){
                    k--;
                }
                else if(total<0){
                    i++;
                }
                else{
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    
                    while(j<k && nums[j]==nums[j+1]) j++;
                    while(j<k && nums[k]==nums[k-1]) k++;
                    
                    j++;
                    k--;
                }
            }
        }
        return res;
        
    }
    public static void main(String args[]){
        int nums[]= {-1, 0, 1, 2, -1, -4};
        System.out.print(threeSum(nums));
    }
}