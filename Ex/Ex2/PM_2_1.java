package Ex.Ex2;

import java.util.Scanner;

public class PM_2_1 {
    public static void main(String[] args){
        System.out.println("please enter k:");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        char[][] array = new char[k + 2][k + 2];
        int x = 1, y = 1;
        for (int i = 0; i < k + 2; i++) {
            for (int j = 0; j < k + 2; j++) {
                if (i == 0 || i == k + 1 || j == 0 || j == k + 1){
                    array[i][j] = '*';
                } else {
                    array[i][j] = ' ';
                }
            }
        }
        array[x][y] = 'X';
        while (true) {
            int nX = x, nY = y;
            System.out.println("please select a number between '0' and '3'");
            System.out.println("0 = UP , 1 = RIGHT , 2 = DOWN , 3 = LEFT");
            Scanner number = new Scanner(System.in);
            int direction = number.nextInt();
            if ( direction == 0 ){
                System.out.println("moving UP");
                nX--;
            } else if ( direction == 1 ) {
                System.out.println("moving RIGHT");
                nY++;
            } else if ( direction == 2 ) {
                System.out.println("moving DOWN");
                nX++;
            } else if ( direction == 3 ) {
                System.out.println("moving LEFT");
                nY--;
            }
            if ( array[nX][nY] == '*'){
                System.out.println("hitting the game wall");
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
            System.out.println("if you want the program to stop,enter '4', otherwise enter something else.");
            Scanner word = new Scanner(System.in);
            int end = word.nextInt();
            if ( end == 4){
                break;
            }
        }
    }
}
