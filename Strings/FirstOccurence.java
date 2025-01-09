// package Strings;

public class FirstOccurence {
    public static int strStr(String haystack,String needle){
        if(needle.isEmpty()){
            return 0;
        }
        int haystackLength=haystack.length();
        int needleLength=needle.length();

        if(needleLength>haystackLength){
            return -1;
        }
        for (int i = 0; i <= haystackLength - needleLength; i++) {
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
public static void main(String[] args) {
    String haystack="sadbutsad";
    String needle= "sad";

    System.out.println(strStr(haystack, needle));
  }    
}