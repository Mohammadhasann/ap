package Ex.Ex2;

import java.util.Scanner;

public class PM_1_2 {
    public static void main(String[] args) {
        System.out.println("please enter k:");
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        char[][] array = new char[k + 2][k + 2];
        for (int i = 0; i < k + 2; i++) {
            for (int j = 0; j < k + 2; j++) {
                if (i == 0 || i == k + 1 || j == 0 || j == k + 1) {
                    array[i][j] = '*';
                } else {
                    array[i][j] = ' ';
                }
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}