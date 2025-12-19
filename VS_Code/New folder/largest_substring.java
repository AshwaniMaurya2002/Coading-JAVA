
class largest_substring {

    public static String findLargestSubstring(String str) {
        int n = str.length();
        String largestSubstring = "";

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String currentSubstring = str.substring(i, j);
                if (currentSubstring.compareTo(largestSubstring) > 0) {
                    largestSubstring = currentSubstring;
                }
            }
        }

        return largestSubstring;
    }

    public static void main(String[] args) {
        String str = "banana";
        String result = findLargestSubstring(str);
        System.out.println("The largest substring is: " + result);
    }
}
