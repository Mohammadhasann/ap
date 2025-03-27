package Ex.Ex2;

import java.util.Random;
import java.util.Scanner;

public class PM_1_3 {
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
            }
        }
        System.out.println("please enter c:");
        int c;
        do {
            Scanner scanner = new Scanner(System.in);
            c = scanner.nextInt();
            if (c > (k - 1) * (k - 1)) {
                System.out.println("Error: The number c is large, please try again.");
            }
        }
        while (c > (k - 1) * (k - 1));
        Random random = new Random();
        for (int i = 0; i < c; ) {
            int x = random.nextInt(k) + 1;
            int y = random.nextInt(k) + 1;
            if (array[x][y] == ' ') {
                array[x][y] = '.';
                i++;
            }
        }
        for (int i = 0; i < k + 2; i++) {
            for (int j = 0; j < k + 2; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}