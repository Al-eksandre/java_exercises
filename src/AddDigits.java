import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddDigits {
    public static int addDigit(int num) {
        String str = Integer.toString(num);
        if (str.length() <= 1) return Integer.parseInt(str);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return Integer.toString(sum).length() <= 1 ? sum : addDigit(sum);
    }
}
