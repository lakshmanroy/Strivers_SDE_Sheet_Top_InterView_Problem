
public class Find_IndexSubString {
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
       }
   public static void main(String[] args) {
    String haystack= "sadbutsad";
    String needle = "sad";

    System.out.println(strStr(haystack,needle));
   } 
}
