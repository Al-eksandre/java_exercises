import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordSubsets {
    public static List<String> isSubset(String[] words1, String[] words2) {
        List<String> subsetList = new ArrayList<>();
        if (words1.length < words2.length) return null;
        for (int i = 0; i < words1.length; i++) {
            String[] word = words1[i].split("");
            for (int j = 0; j < word.length; j++) {
                for (int k = 0; k < words2.length; k++) {
                }
            }

        }
        return subsetList;
    }
}
