
import java.util.HashMap;

public class LongestSubArray_K {
    public static int maxLen(int arr[]){
        HashMap<Integer,Integer>map=new HashMap<>();
       int maxlength=0;
       int prefixSum=0;

       for(int i=0;i<arr.length;i++){
        prefixSum+=arr[i];

        if(prefixSum==0){
            maxlength=i+1;
        }
        if(map.containsKey(prefixSum)){
          maxlength=Math.max(maxlength, i-map.get(prefixSum));
        }
        else{
            map.put(prefixSum, i);
        }
       }
       return maxlength;
        
    }
    public static void main(String[] args) {
        int arr[]= {15, -2, 2, -8, 1, 7, 10, 23};

        System.out.println(maxLen(arr));
    }
}
