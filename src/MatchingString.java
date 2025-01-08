import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MatchingString {
    public static List<String> matchingString(String[] words) {
        List<String> wordList = Arrays.stream(words).collect(Collectors.toList());
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < wordList.size(); i++) {
            String current = wordList.get(i);
            for (int j = 0; j < wordList.size(); j++) {
                if (!resultList.contains(wordList.get(j)) && current.indexOf(wordList.get(j)) >= 0 && !current.equals(wordList.get(j)))
                    resultList.add(wordList.get(j));
            }
        }
        return resultList;
    }
}
