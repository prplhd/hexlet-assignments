package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map getWordCount(String sentence) {
        if (sentence.equals("")) {
            return new HashMap<String, Integer>();
        }
        String[] words = sentence.split(" ");
        Map<String, Integer> hashMap = new HashMap<>();

        for (String currentWord : words) {
            var counter = 0;
            for (String word : words) {
                if (currentWord.equals(word)) {
                    counter++;
                }
            }

            hashMap.put(currentWord, counter);
        }
        System.out.println(hashMap);
        return hashMap;
    }

    public static String toString(Map<String, Integer> hashMap) {
        if (hashMap.isEmpty()) {
            return "{}";
        }

        var result = "{\n";
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            result = result + "  " + entry.getKey() + ": " + entry.getValue() + "\n";
        }
        result = result + "}";
        System.out.println(result);
        return result;
    }
}
//END
