package org.example;

import java.security.InvalidParameterException;

@SuppressWarnings("uncommentedmain")
public class Palindrome {
    public static void main(final String[] args) {
        final String word = "n123";
        System.out.println(word);
        System.out.println(wordReversed(word));
        if (isPalindrom(word)) {
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
        return word.equals(wordReversed(word));
    }

    private static String wordReversed(final String word) {
        final char[] charArray = word.toCharArray();
        final int lenghtArray = charArray.length;
        final char[] charArrayReversed = new char[lenghtArray];
        for (int i = 0; i < lenghtArray; i++) {
            charArrayReversed[i] = charArray[lenghtArray - i - 1];
        }
        return new String(charArrayReversed);
    }
}
