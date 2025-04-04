import java.lang.reflect.Array;

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
        System.out.println(PascalsTriangle.generate(5));
        String[] words1 = {"amazon", "apple", "facebook", "google", "leetcode"};
        String[] words2 = {"e", "o"};
        System.out.println(WordSubsets.isSubset(words1, words2));
        int nums[] = {1, 2, 3, 1};
        System.out.println(ContainsDuplicate.containsDuplicate(nums));
        System.out.println(AddDigits.addDigit(38));
        int[][] g = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        System.out.println(IslandPerimeter.islandPerimeter(g));
        int[] arr1 = {4, 9, 5};
        int[] arr2 = {9, 4, 9, 8, 4};
        ArrayIntersection.twoArrIntersection(arr1,arr2);
    }
}