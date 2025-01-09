public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;
        String[] strArr = s.trim().toLowerCase().replaceAll("[^a-zA-Z0-9]", "").split("");
        for (int i = 0; i < strArr.length / 2; i++) {
            String currLetter = strArr[i];
            if (!currLetter.equals(strArr[(strArr.length - 1) - i])) return false;
        }
        return true;
    }
}
