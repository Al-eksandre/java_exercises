

public class CountingWordsWithGivenPrefix {
    public static int prefixCount(String[] words, String pref) {
        int prefixedWordCounter = 0;
        for (int i = 0; i < words.length; i++) {
            if (pref.length() > words[i].length()) continue;
            String currentWordPrefix = words[i].substring(0, pref.length());
            if (currentWordPrefix.equals(pref)) prefixedWordCounter++;
        }
        return prefixedWordCounter;
    }
}
