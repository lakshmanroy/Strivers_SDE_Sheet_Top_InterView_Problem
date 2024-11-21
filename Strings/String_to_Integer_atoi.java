public class String_to_Integer_atoi {
    public static int myAtoi(String s) {
        // Trim leading and trailing whitespaces
        s = s.trim();
        if (s.isEmpty()) return 0;

        // Variables for sign and result
        int sign = 1, i = 0;
        long result = 0;

        // Check for optional '+' or '-'
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Process the numeric part of the string
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');

            // Check for 32-bit integer overflow
            if (sign * result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if (sign * result > Integer.MAX_VALUE) return Integer.MAX_VALUE;

            i++;
        }

        return (int) (sign * result);
    }
    public static void main(String[] args) {
        String s= "1337c0d3";

        System.out.println(myAtoi(s));
    }
}
