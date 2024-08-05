package org.example;

import java.security.InvalidParameterException;

@SuppressWarnings("uncommentedmain")
public class Palindrome {
    public static void main(final String[] args) {
        final String word = "n12321n";
        System.out.println(word);
        if (isPalindrom1(word)) {
            System.out.println(word + " is palindrom.");
        } else {
            System.out.println(word + " isn't palindrom.");
        }
    }

    //1234554321, madam
    public static boolean isPalindrom(final String word) throws InvalidParameterException {
        final int lengthWord = word.length();
        if (lengthWord < 2) {
            throw new InvalidParameterException("Аргумент должен состоять хотя бы из 2 символов.");
        }
        for (int i = 0; i < lengthWord / 2; i++) {
            if (word.charAt(i) != word.charAt(lengthWord - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrom1(final String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
