import java.util.HashMap;

public class OccurrenceOfString {

    public static void occurrenceOfString(String str) {
        System.out.println("The Input of unique string and its count: "+str);
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char element = str.charAt(i);
            if (map.containsKey(element)) {
                map.put(element, map.get(element) + 1);
            } else {
                map.put(element, 1);
            }
        }
        System.out.println(map);
    }
}
