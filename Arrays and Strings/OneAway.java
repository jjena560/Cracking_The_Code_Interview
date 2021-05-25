public class OneAway {
    public static boolean oneEditAway(String first, String second) {
        if (first.length() == second.length()) {
            return oneEditPlace(first, second);
        } else if (first.length() + 1 == second.length()) {
            return oneEditInsert(first, second);
        } else if (first.length() - 1 == second.length()) {
            return oneEditInsert(second, first);
        }

        return false;
    }

    static boolean oneEditPlace(String first, String second) {
        boolean foundDiff = false;
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                if (foundDiff) {
                    return false;
                }
                foundDiff = true;
            }
        }
        return foundDiff;
    }

    static boolean oneEditInsert(String first, String second) {
        int index1 = 0;
        int index2 = 0;

        while (index2 < second.length() && index1 < first.length()) {
            if (first.charAt(index1) != second.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;

    }

    public static void main(String args[]) {
        String first = "pale";
        String second = "pble";
        boolean res = oneEditAway(first, second);
        System.out.println(res);
    }
}
