
public class Main {
    public static void main(String[] args) {
        System.out.println(AddBinary.addBinary("11", "1"));
        String[] strWords = {"leetcoder", "leetcode", "od", "hamlet", "am"};
        System.out.println(MatchingString.matchingString(strWords));
        String[] words = {"b", "ba", "b", "b", "b"};
        System.out.println(CountPrefixSuffixPairs.countPrefixSuffixPairs(words));
        String[] prefixWords = {"pay", "attention", "practice", "attend"};
        System.out.println(CountingWordsWithGivenPrefix.prefixCount(prefixWords, "at"));
        int[] numsForMajority = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(MajorityElement.majorityElement(numsForMajority));
        System.out.println(ValidPalindrome.isPalindrome("race a car"));
    }
}