import java.util.ArrayList;
import java.util.List;

public class ReverseBits {
    public static Long reverseBits(String n) {
        List<String> bitList = new ArrayList<>(List.of(n.split("")).reversed());
        String num = String.join("", bitList);
        System.out.println(num);
        return Long.parseLong(num, 2);
    }
}
