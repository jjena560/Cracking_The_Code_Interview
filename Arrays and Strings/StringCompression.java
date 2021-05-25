public class StringCompression {
    static String compressString(String str) {
        String cstring = "";
        int countConsecutive = 0;
        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;

            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                cstring += "" + str.charAt(i) + countConsecutive;
                countConsecutive = 0;

            }
        }
        return cstring.length() < str.length() ? cstring : str;
    }

    public static void main(String args[]) {
        String str = "aabcccccaaa";
        System.out.print(compressString(str));

    }
}
