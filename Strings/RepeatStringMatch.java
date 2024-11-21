public class RepeatStringMatch {
    public static int repeatingString(String a, String b) {
        // Calculate minimum repetitions of `a` needed to exceed `b` in length
        int repeatCount = (b.length() - 1) / a.length() + 1;
        StringBuilder sb = new StringBuilder();
        
        // Append `a` `repeatCount` times
        for (int i = 0; i < repeatCount; i++) {
            sb.append(a);
        }
        
        // Check if `b` is a substring
        if (sb.toString().contains(b)) {
            return repeatCount;
        }
        
        // Append `a` one more time and check again
        sb.append(a);
        if (sb.toString().contains(b)) {
            return repeatCount + 1;
        }
        
        // If not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        String a = "abcd";
        String b = "cdabcdab";

        System.out.println(repeatingString(a, b)); // Output: 3
    }
}
