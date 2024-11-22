public class VersionCompare {
    public static int compareVersion(String version1, String version2) {
        // Split the version strings into arrays of strings
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        // Determine the maximum length between the two arrays
        int maxLength = Math.max(v1.length, v2.length);

        // Compare each revision
        for (int i = 0; i < maxLength; i++) {
            // Parse the revision, default to 0 if index is out of bounds
            int rev1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            int rev2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;

            // Compare revisions
            if (rev1 < rev2) {
                return -1;
            } else if (rev1 > rev2) {
                return 1;
            }
        }

        // All revisions are equal
        return 0;
    }

    public static void main(String[] args) {
        String version1 = "1.01";
        String version2 = "1.001";

        System.out.println(compareVersion(version1, version2)); // Output: -1
    }
}
