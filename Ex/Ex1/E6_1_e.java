package Ex.Ex1;

import java.util.Scanner;

public class E6_1_e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a naumber:");
        int number = scanner.nextInt();
        int res = 0;
        int a = number;
        int d = 0;
        while (a != 0) {
            int r = a % 10;
            a /= 10;
            d++;
        }
        while (number != 0) {
            for (int i = 0; i <= d; i++) {
                int r = number % 10;
                if (r % 2 == 1) {
                    res += r;
                    number /= 10;
                } else {
                    number /= 10;
                }

            }
            System.out.println("result="+res);
        }
    }
}