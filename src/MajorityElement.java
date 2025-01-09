import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> elemCount = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (!elemCount.containsKey(nums[i])) {
                int counter = 0;
                elemCount.put(nums[i], counter);
            } else {
                int counter = elemCount.get(nums[i]);
                counter++;
                elemCount.put(nums[i], counter);
            }
        }
        Map.Entry<Integer, Integer> maxEntry = elemCount.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        return maxEntry.getKey();
    }
}
