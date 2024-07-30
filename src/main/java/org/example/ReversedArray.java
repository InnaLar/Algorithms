package org.example;

@SuppressWarnings("uncommentedmain")
public class ReversedArray {
    public static void reverseArray(final char[] charArray) {
        char temp;
        final int lengthArray = charArray.length;
        for (int i = 0; i < lengthArray / 2; i++) {
            temp = charArray[i];
            charArray[i] = charArray[lengthArray - 1 - i];
            charArray[lengthArray - 1 - i] = temp;
        }
    }

    public static String reverseString(final String word) {
        final char[] charArray = word.toCharArray();
        reverseArray(charArray);
        return new String(charArray);
    }

    public static void main(final String[] args) {
        final String word = "KashaMalasha";
        System.out.println(word);
        System.out.println(reverseString(word));
    }
}
