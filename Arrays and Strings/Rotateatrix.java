import java.util.Scanner;

public class Rotateatrix {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] arr = new int[n][n];
        // input the matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = scn.nextInt();
            }

        }
        // int[][] arr = { { 'a', 'b', 'c', 'd' }, { 'e', 'f', 'g', 'h' }, { 'i', 'j',
        // 'k', 'l' },
        // { 'm', 'n', 'o', 'p' } };

        // transpose the matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // now reverse the coloumns
        for (int i = 0; i < arr.length; i++) {
            int li = 0;
            int ri = arr.length - 1;

            while (li < ri) {
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;

                li++;
                ri--;

            }

        }
        display(arr);

    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "\n");
            }

        }

    }
}
