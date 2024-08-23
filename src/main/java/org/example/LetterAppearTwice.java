package org.example;

import java.util.HashSet;

@SuppressWarnings("uncommentedmain")
public class LetterAppearTwice {
    public static char twiceLetter(final String s) {
        final char[] chars = s.toCharArray();
        final HashSet<Character> set = new HashSet<Character>();
        for (char aChar : chars) {
            if (!set.contains(aChar)) {
                set.add(aChar);
            } else {
                return aChar;
            }
        }
        return Character.MIN_VALUE;
    }

    public static void main(final String[] args) {
        final String s = "abrakadabra";
        final char chr = twiceLetter(s);
        System.out.println(chr);
    }
}
