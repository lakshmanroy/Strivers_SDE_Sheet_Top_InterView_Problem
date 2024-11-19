import java.util.Arrays;
public class Unique_Paths {
    public static int unquePaths(int m,int n){
        int arr[]= new int[n];
        Arrays.fill(arr,1);
        for(int row=1;row<m;row++){
            int currRow[]= new int[n];
            Arrays.fill(currRow,1);
            for(int col=1;col<n;col++){
                currRow[col]= currRow[col-1]+arr[col];
            }
            arr=currRow;
        }
        return arr[n-1];
    }
    public static void main(String args[]){
        int m=3,n=7;

        System.out.println(unquePaths(m, n));
    }
}
