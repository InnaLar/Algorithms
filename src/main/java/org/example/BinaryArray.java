package org.example;

//String arr = "1101100111";
@SuppressWarnings("uncommentedmain")
public class BinaryArray {
    public static int maxLength(final String arr, final int k) {
        int res = 0;
        int cnt = 0;
        int left = 0;
        int cntK = 0;
        for (int right = 0; right < arr.length(); right++) {
            if (arr.charAt(right) == '1') {
                cnt++;
            }
            if (arr.charAt(right) == '0') {
                cntK++;
                cnt++;
            }
            while (cntK > k) {
                if (arr.charAt(left) == '0') {
                    cntK--;
                }
                left++;
                cnt--;
            }
            res = Math.max(res, cnt);
        }
        return res;
    }

    public static void main(final String[] args) {
        final String arr = "11011001111100111111011";
        final int res = maxLength(arr, 2);
        System.out.println(res);
    }
}
