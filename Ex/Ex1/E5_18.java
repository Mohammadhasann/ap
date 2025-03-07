package Ex.Ex1;

import java.util.Arrays;
import java.util.Scanner;

public class E5_18 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];
        System.out.println("please enter three words:");
        for ( int i = 0; i < 3; i++) {
            strings[i] = scanner.nextLine();
        }
        Arrays.sort(strings);
        for ( String str : strings){
            System.out.println(str);
        }
    }
}
