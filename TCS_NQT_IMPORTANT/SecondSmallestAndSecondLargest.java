public class SecondSmallestAndSecondLargest {
    public static int[] LargestAndSmallest(int nums[]){
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(smallest>nums[i]){
                secondSmallest=smallest;
                smallest=nums[i];
            }
            else if(secondSmallest>nums[i]){
                secondSmallest=nums[i];
            }
            if(largest<nums[i]){
                secondLargest=largest;
                largest=nums[i];
            }
            else if(secondLargest<nums[i]){
                secondLargest=nums[i];
            }
        }
        return new int[]{secondLargest,secondSmallest};
    }
    public static void main(String args[]){
        int nums[]={1,2,3,4,5};
        int result[]=LargestAndSmallest(nums);
        System.out.println(result[0]+ " "+result[1]);

    }
}
