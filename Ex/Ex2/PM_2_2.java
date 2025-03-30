package Ex.Ex2;

import java.util.Random;
import java.util.Scanner;

public class PM_2_2 {
    public static void main(String[] args){
        long start = System.currentTimeMillis();
        System.out.println("please enter k:");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        char[][] array = new char[k + 2][k + 2];
        int x = 1, y = 1, point = 0;
        for (int i = 0; i < k + 2; i++) {
            for (int j = 0; j < k + 2; j++) {
                if ( i == 0 || i == k + 1 || j == 0 || j == k + 1){
                    array[i][j] = '*';
                } else {
                    array[i][j] = ' ';
                }
            }
        }
        System.out.println("please enter c:");
        int c;
        do {
            Scanner pointy = new Scanner(System.in);
            c = pointy.nextInt();
            if ( c > (k - 1)*(k - 1)){
                System.out.println("Error: The number c is large, please try again.");
            }
        }
        while ( c > (k - 1)*(k - 1));
        Random random = new Random();
        for (int i = 0; i < c; ) {
            int d = random.nextInt(k) + 1;
            int z = random.nextInt(k) + 1;
            if (array[d][z] == ' ') {
                array[d][z] = '.';
                i++;
            }
        }
        array[x][y] = 'X';
        for (int i = 0; i < k + 2; i++) {
            for (int j = 0; j < k + 2; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        while (true) {
            int nX = x, nY = y;
            System.out.println("please select a number between '0' and '3'");
            System.out.println("0 = UP , 1 = RIGHT , 2 = DOWN , 3 = LEFT");
            Scanner number = new Scanner(System.in);
            int direction = number.nextInt();
            if (direction == 0) {
                System.out.println("moving UP");
                nX--;
            } else if (direction == 1) {
                System.out.println("moving RIGHT");
                nY++;
            } else if (direction == 2) {
                System.out.println("moving DOWN");
                nX++;
            } else if (direction == 3) {
                System.out.println("moving LEFT");
                nY--;
            }
            if (array[nX][nY] == '*'){
                System.out.println("hitting the game wall");
            } else if (array[nX][nY] == '.') {
                point++;
                array[x][y] = ' ';
                x = nX;
                y = nY;
                array[x][y] = 'X';
            } else {
                array[x][y] = ' ';
                x = nX;
                y = nY;
                array[x][y] = 'X';
            }
                for (int i = 0; i < k + 2; i++) {
                    for (int j = 0; j < k + 2; j++) {
                        System.out.print(array[i][j]);
                    }
                    System.out.println();
                }
            try {
                Thread.sleep(1000);
            } catch (Exception e){}
            System.out.println("your point:" + point);
            if ( point == c){
                break;
            }
        }
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("timeElapsed:" + timeElapsed);
    }
}
