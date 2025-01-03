
import java.util.HashMap;

public class MajorityElements {
    public static int majority(int nums[]){
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;

        int result=n/2;

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);

            if(map.get(num)>result){
                return num;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={3, 2, 3};

        System.out.println(majority(nums));
    }
}
