import java.util.*;

public class BitOperations {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = scn.nextInt();
        int j = scn.nextInt();
        int k = scn.nextInt();
        int m = scn.nextInt();

        // write your code here
        // to set the bit on
        int onMask = (1 << i);
        // to set the bit off
        int offMask = ~(1 << j);
        // if he bit is on change it to off and vice versa
        int tMask = (1 << k);
        // check if the bit is on or off
        int checkMask = (1 << m);

        System.out.println(n | onMask);
        System.out.println(n & offMask);
        System.out.println(n ^ tMask);
        System.out.println((n & checkMask) == 0 ? false : true);
    }

}
