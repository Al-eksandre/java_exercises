import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    static public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int number : nums) {
            numSet.add(number);
        }
        return numSet.size() == nums.length ? false : true;
    }
}
