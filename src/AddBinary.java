public class AddBinary {
    public static String addBinary(String a, String b) {
        long number1 = Long.parseLong(a, 2);
        long number2 = Long.parseLong(b, 2);
        long sum = number1 + number2;
        return Long.toString(sum, 2);
    }
}
