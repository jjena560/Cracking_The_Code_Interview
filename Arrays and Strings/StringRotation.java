public class StringRotation {
    static boolean isRotation(String s1, String s2) {
        int length = s1.length();
        if (length == s2.length() && length > 0) {
            String s1s2 = s1 + s2;
            return isSubString(s1s2, s1);
        }
        return false;
    }

    static boolean isSubString(String str1, String str2) {
        return false;
    }

    public static void main(String args[]) {
        String str1 = "waterbottle";
        String str2 = "erbottlewat";

        isRotation(str1, str2);

    }
}
