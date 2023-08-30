package exercise;

import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String symbols, String word) {
        List<Character> symbolsCharList = new ArrayList<>();
        for (var ch: symbols.toCharArray()) {
            symbolsCharList.add(Character.toLowerCase(ch));
        }

        List<Character> wordCharList = new ArrayList<>();
        for (var ch: word.toCharArray()) {
            wordCharList.add(Character.toLowerCase(ch));
        }

        for (var charOfSymbols: symbolsCharList) {
            for (var charOfWord: wordCharList) {
                if (charOfSymbols == charOfWord) {
                    wordCharList.remove(charOfWord);
                    break;
                }
            }
        }

        return wordCharList.isEmpty();
    }
}
//END
