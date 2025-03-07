package Ex.Ex1;

import java.util.Scanner;

public class E5_15 {
    public static void main(String[] args){
        double tax = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your income:");
        double inCome = scanner.nextDouble();
        if ( inCome <= 50000 ){
            tax = inCome * 0.01;
        } else if ( inCome <= 75000 ) {
            tax = inCome * 0.02;
        } else if ( inCome <= 100000 ) {
            tax = inCome * 0.03;
        } else if ( inCome <= 250000 ) {
            tax = inCome * 0.04;
        } else if ( inCome <= 500000 ) {
            tax = inCome * 0.05;
        }
        else {
            tax = inCome * 0.06;
        }
        System.out.println( "your tax :"+ tax);
        scanner.close();
    }
}
