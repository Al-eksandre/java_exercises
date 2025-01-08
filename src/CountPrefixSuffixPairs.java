import java.util.ArrayList;
import java.util.List;

public class CountPrefixSuffixPairs {
    public static int countPrefixSuffixPairs(String[] words) {
        List<String> matchWords = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String current = words[i];
            for (int j = 1; j < words.length; j++) {
                if (i == j) continue;
                if (i < j && isPrefixAndSuffix(current, words[j])) matchWords.add(current);
            }
        }
        return matchWords.size();
    }

    public static boolean isPrefixAndSuffix(String str1, String str2) {
        if (str1.length() > str2.length()) return false;
        String prefix = str2.substring(0, str1.length());
        String suffix = str2.substring(str2.length() - str1.length());
        return prefix.equals(str1) && suffix.equals(str1);
    }
}
