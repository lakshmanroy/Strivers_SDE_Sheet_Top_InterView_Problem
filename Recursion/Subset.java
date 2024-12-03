import java.util.ArrayList;
import java.util.List;
public class Subset {
    public static List<List<Integer>>subset(int nums[]){
        List<List<Integer>>result=new ArrayList<>();
        genrateSubset(0,nums,new ArrayList<>(),result);
        return result;
    }
    public static void genrateSubset(int index,int nums[],List<Integer>current,List<List<Integer>>result){
        result.add(new ArrayList<>(current));

        for(int i=index;i<nums.length;i++){
            current.add(nums[i]);

            genrateSubset(i+1, nums, current, result);

            current.remove(current.size()-1);
        }
    }
   public static void main(String[] args) {
       int nums[]={1,2,3};
       List<List<Integer>>result=subset(nums);
       System.out.println(result);
   } 
}
