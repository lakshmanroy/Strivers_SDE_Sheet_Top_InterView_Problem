import java.util.*;

public class pascalTrainglell {
    public static List<Integer>generate(int numRow){
        List<Integer>row=new ArrayList<>();
        row.add(1);
        for(int i=1;i<=numRow;i++){
             row.add(0);
             for(int j=i;j>0;j--){
                row.set(j,row.get(j)+row.get(j-1));
             }
        }
        return row;
    }
    public static void main(String[] args) {
        int numRow=3;

        System.out.println(generate(numRow));
    }
}
