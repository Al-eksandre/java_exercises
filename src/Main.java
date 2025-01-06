//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }

    public static String addBinary(String a, String b) {
        long number1 = Long.parseLong(a,2);
        long number2 = Long.parseLong(b,2);
        long sum = number1 + number2;
        return Long.toString(sum,2);
    }
}