public class Count_and_Say {
    public static String countAndSay(int n){
        String result="1"; //start with the first element
        for(int i=2;i<=n;i++){
             StringBuilder current= new StringBuilder();
             int count=1;

             // Go through the previous result
             for(int j=1;j<result.length();j++){
                if(result.charAt(j)==result.charAt(j-1)){
                    count++; // Count consecutive characters
                }
                else{
                    current.append(count).append(result.charAt(j-1)); // Add count and character
                    count=1;// Reset count
                }
             }
              // Append the last group
              current.append(count).append(result.charAt(result.length()-1));
              result=current.toString();
        }
        return result;
    }
    public static void main(String[] args) {
        int n=4;

        System.out.println(countAndSay(n));

    }
}
