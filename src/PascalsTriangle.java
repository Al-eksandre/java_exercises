import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>();
        if (arr.isEmpty()) arr.add(Arrays.asList(1));
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = arr.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);
            for (int j = 1; j < i; j++) {
                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            currentRow.add(1);
            arr.add(currentRow);
        }
        return arr;
    }
}
