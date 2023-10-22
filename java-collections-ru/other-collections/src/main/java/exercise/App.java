package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
class App {
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> data1, Map<String, Object> data2) {
        LinkedHashMap<String, String> result = new LinkedHashMap<>();

        Set<String> added = new TreeSet<>();
        added.addAll(data2.keySet());
        added.removeAll(data1.keySet());
        for (String key : added) {
            result.put(key, "added");
        }

        Set<String> deleted = new TreeSet<>();
        deleted.addAll(data1.keySet());
        deleted.removeAll(data2.keySet());
        for (String key : deleted) {
            result.put(key, "deleted");
        }

        Set<String> intersection = new TreeSet<>();
        intersection.addAll(data1.keySet());
        intersection.retainAll(data2.keySet());
        for (String key : intersection) {
            if (data1.get(key) == data2.get(key)) {
                result.put(key, "unchanged");
            } else {
                result.put(key, "changed");
            }
        }
        System.out.println(result);
        return result;
    }
}
//END
