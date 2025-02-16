import java.util.HashSet;
import java.util.Set;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        Set<String> strSet = new HashSet<>();
        int sizeBefore = 0;
        for (int i = 0; i < s.length(); i++) {
            strSet.add(String.valueOf(s.charAt(i)));
            sizeBefore = strSet.size();
        }
        int sizeAfter = 0;
        for (int i = 0; i < t.length(); i++) {
            strSet.add(String.valueOf(t.charAt(i)));
            sizeAfter = strSet.size();
        }
        if (sizeAfter == sizeBefore) return true;
        return false;
    }
}
