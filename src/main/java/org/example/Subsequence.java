package org.example;

public class Subsequence {
    public static boolean isSubsequence(final String string, final String subString) {
        int left = 0;
        int right = 0;
        while (left < subString.length() && right < string.length()) {
            if (subString.charAt(left) == string.charAt(right)) {
                left++;
            }
            right++;
        }
        return left == subString.length();
    }
}
