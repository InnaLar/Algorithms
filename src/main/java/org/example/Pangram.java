package org.example;
import java.util.HashSet;
import java.util.Set;

//Панграмма — это строка, в которой каждая буква английского алфавита встречается хотя бы один раз.
//Напишите алгоритм, который для исходной строки, содержащей только строчные латинские буквы, вернет true, если строка является панграммой, false в противном случае.
@SuppressWarnings("uncommentedmain")
public class Pangram {
    public static boolean isPangram(final String word) {
        final Set<Character> wordHashSet = new HashSet<>();
        char[] wordCharArray = word.toCharArray();
        for (char ch: wordCharArray) {
            wordHashSet.add(ch);
        }
        return wordHashSet.size()==26;
    }

    public static void main(final String[] args) {
        //final String word = "pangram";
        final String word = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(isPangram(word));
    }
}
