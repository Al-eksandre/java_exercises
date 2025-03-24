import java.lang.reflect.Array;
import java.util.*;

public class ArrayIntersection {
    public static int[] twoArrIntersection(int arr1[], int arr2[]) {
        Set<Integer> intersectionSet = new HashSet<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) intersectionSet.add(arr1[i]);
            }
        }
        return intersectionSet.stream().mapToInt(Integer::intValue).toArray();
    }
}
