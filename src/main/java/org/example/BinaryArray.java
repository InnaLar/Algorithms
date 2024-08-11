package org.example;

//String arr = "1101100111";
@SuppressWarnings("uncommentedmain")
public class BinaryArray {
    public static int maxLength(final String arr) {
        int res = 0;
        int curr = 0;
        int cnt = 0;
        int left = 0;
        boolean flipped = false;
        while (curr < arr.length()) {
            if (arr.charAt(curr) == '1') {
                cnt++;
            }
            if (arr.charAt(curr) == '0' && !flipped) {
                cnt++;
                flipped = true;
                left = curr + 1;
            }
            if (arr.charAt(curr) == '0' && flipped) {
                cnt = curr - left + 1;
                left = curr + 1;
            }
            curr++;
            res = Math.max(res, cnt);
        }
        return res;
    }

    public static void main(final String[] args) {
        final String arr = "11011001111100111111";
        final int res = maxLength(arr);
        System.out.println(res);
    }
}
