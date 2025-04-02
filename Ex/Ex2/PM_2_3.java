package Ex.Ex2;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class PM_2_3 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        if (new File("game_save.txt").exists()) {
            loadGame();
        } else {
            System.out.println("please enter k:");
            int k = scanner.nextInt();
            char[][] array = new char[k + 2][k + 2];
            int x = 1, y = 1, point = 0;
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
                c = scanner.nextInt();
                if (c > (k - 1) * (k - 1)) {
                    System.out.println("Error: The number c is large, please try again.");
                }
            }
            while (c > (k - 1) * (k - 1)) ;
            array[x][y] = 'X';
            Random random = new Random();
            for (int i = 0; i < c; ) {
                int d = random.nextInt(k) + 1;
                int z = random.nextInt(k) + 1;
                if (array[d][z] == ' ' && array[d][z] != 'X') {
                    array[d][z] = '.';
                    i++;
                }
            }
            printArray(array, k);
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
                if (array[nX][nY] == '*') {
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
                printArray(array, k);
                System.out.println("Your points:" + point);
                saveGame(k, point, x, y, c, array);
                if (point == c) {
                    break;
                }
                System.out.println("if you want the program to stop, enter 4; otherwwise enter something else.");
                int q = scanner.nextInt();
                if (q == 4){
                    break;
                }
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
            long finish = System.currentTimeMillis();
            long timeElapsed = finish - start;
            System.out.println("Time elapsed" + timeElapsed);
        }
    }

    public static void printArray(char[][] array, int k) {
        for (int i = 0; i < k + 2; i++) {
            for (int j = 0; j < k + 2; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    public static void saveGame(int k, int point, int x, int y, int c, char[][] array) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("game_save.txt"))) {
            writer.write(k + "\n");
            writer.write(point + "\n");
            writer.write(x + "\n");
            writer.write(y + "\n");
            writer.write(c + "\n");
            for (int i = 0; i < k + 2; i++) {
                for (int j = 0; j < k + 2; j++) {
                    writer.write(array[i][j]);
                }
                writer.newLine();
            }
            System.out.println("Game saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadGame() {
        try (BufferedReader reader = new BufferedReader(new FileReader("game_save.txt"))) {
            int k = Integer.parseInt(reader.readLine());
            int point = Integer.parseInt(reader.readLine());
            int x = Integer.parseInt(reader.readLine());
            int y = Integer.parseInt(reader.readLine());
            int c = Integer.parseInt(reader.readLine());
            char[][] array = new char[k + 2][k + 2];
            for (int i = 0; i < k + 2; i++) {
                String line = reader.readLine();
                for (int j = 0; j < k + 2; j++) {
                    array[i][j] = line.charAt(j);
                }
            }
            System.out.println("Game loaded.");
            System.out.println("k:" + k + "\n" + "point:" + point + "\n" + "x:" + x + "\n" + "y:" + y + "\n" + "c:" + c);
            if (point == c) {
                System.out.println("The Game is over");
                System.out.println("Start new Game...");
                Scanner scanner = new Scanner(System.in);
                System.out.println("please enter k:");
                k = scanner.nextInt();
                array = new char[k + 2][k + 2];
                x = 1;
                y = 1;
                point = 0;
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
                do {
                    c = scanner.nextInt();
                    if (c > (k - 1) * (k - 1)) {
                        System.out.println("Error: The number c is large, please try again.");
                    }
                }
                while (c > (k - 1) * (k - 1)) ;
                Random random = new Random();
                array[x][y] = 'X';
                for (int i = 0; i < c; ) {
                    int d = random.nextInt(k) + 1;
                    int z = random.nextInt(k) + 1;
                    if (array[d][z] == ' ' && array[d][z] != 'X') {
                        array[d][z] = '.';
                        i++;
                    }
                }
                runGame(k, point, x, y, c, array);
            } else {
                runGame(k, point, x, y, c, array);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void runGame(int k, int point, int x, int y, int c, char[][] array){
        printArray(array, k);
        long start = System.currentTimeMillis();
        array[x][y] = 'X';
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
            if (array[nX][nY] == '*') {
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
            printArray(array, k);
            System.out.println("Your points:" + point);
            saveGame(k, point, x, y, c, array);
            if (point == c) {
                break;
            }
            System.out.println("if you want the program to stop, enter 4; otherwwise enter something else.");
            Scanner numbere = new Scanner(System.in);
            int q = numbere.nextInt();
            if (q == 4){
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("Time elapsed" + timeElapsed);
    }
}
