package Ex.Ex1;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class E6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the size:");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("please enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(" numbers list:");
        for (int number : numbers) {
            System.out.println(number + " ");
        }
        int maxNumber = numbers[0];
        int minNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }
        System.out.println("numbermax:" + maxNumber);
        System.out.println("numbermin:" + minNumber);
        int even = 0;
        int odd = 0;
        for (int i = 0; i < size; i++) {
            if (numbers[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Number of even numbers:" + even);
        System.out.println("Number of odd numbers:" + odd);

        int sumNum = numbers[0] + numbers[1];
        for (int i = 2; i < size; i++) {
            sumNum += numbers[i];
        }
        System.out.println("sumnumbers:" + sumNum);
    }
}