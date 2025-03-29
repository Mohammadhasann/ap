package Ex.Ex2;

import java.util.Random;
import java.util.Scanner;

public class PM_1_5 {
    public static void main(String[] args) {
        System.out.println("please enter k:");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        char[][] array = new char[k + 2][k + 2];
        int x = 1, y = 1;
        for (int i = 0; i < k + 2; i++) {
            for (int j = 0; j < k + 2; j++) {
                if (i == 0 || i == k + 1 || j == 0 || j == k + 1) {
                    array[i][j] = '*';
                } else {
                    array[i][j] = ' ';
                }
            }
        }
        array[x][y] = 'X';
        while (true) {
            Random random = new Random();
            int direction = random.nextInt(4);
            if (direction == 0) {
                System.out.println("Moving UP");
            } else if (direction == 1) {
                System.out.println("Moving RIGHT");
            } else if (direction == 2) {
                System.out.println("Moveng DOWN");
            } else {
                System.out.println("Moving LEFT");
            }
            int nX = x, nY = y;
            if (direction == 0) {
                nX--;
            } else if (direction == 1) {
                nY++;
            } else if (direction == 2) {
                nX++;
            } else if (direction == 3) {
                nY--;
            }
            if (array[nX][nY] == '*') {
                System.out.println("hitting the game wall.");
            } else {
                array[x][y] = ' ';
                x = nX;
                y = nY;
                array[x][y] = 'X';
                for (int i = 0; i < k + 2; i++) {
                    for (int j = 0; j < k + 2; j++) {
                        System.out.print(array[i][j]);
                    }
                    System.out.println();
                }
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e){}
            System.out.println("if you want the program to stop,enter zero.");
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            if (number == 0){
                break;
            }
        }
    }
}