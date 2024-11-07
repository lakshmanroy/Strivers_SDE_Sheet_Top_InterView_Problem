
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_Intervals {
    public static int[][] merge(int intervals[][]){
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0], b[0]));
        List<int[]>merged=new ArrayList<>();

        // Initialize with the first interval
        int currendInterval[]= intervals[0];
        merged.add(currendInterval);

        for(int interval[]:intervals){
            int currentEnd=currendInterval[1];
            int nextStart=interval[0];
            int nextEnd=interval[1];

             // Check if intervals overlap
             if(nextStart<=currentEnd){
                currendInterval[1]=Math.max(currentEnd, nextEnd);
             }
             else{
                currendInterval=interval;
                merged.add(currendInterval);
             }
        }
        return merged.toArray(new int[merged.size()][]);
    }
    public static void main(String[] args) {
        int[][] intervals = {{1,3}, {2,6}, {8,10}, {15,18}};
        int result[][]= merge(intervals);

        for(int interval[]:result){
           System.out.println(Arrays.toString(interval)+ " ");
        }
    }
}
