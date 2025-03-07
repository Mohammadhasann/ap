package Ex.Ex1;

import java.util.Scanner;

public class E5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a decimal number:");
        double number = scanner.nextDouble();
        if (number == 0) {
            System.out.println("zero");
        } else {
            String result = (number > 0) ? "Positive" : "Negative";
            if (Math.abs(number) < 1) {
                result += "small";
            } else if (Math.abs(number) > 1000000) {
                result += "large";
            }
            System.out.println(result);
        }
        scanner.close();
    }
}
