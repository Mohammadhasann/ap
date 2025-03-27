package Ex.Ex2;

import java.util.Scanner;

public class PM_1_4 {
    public static void main(String[] args){
        System.out.println("please enter a character:");
        Scanner character = new Scanner(System.in);
        while (true){
            String input = character.nextLine();
            if (input.equals("w")){
                System.out.println("UP");
            } else if (input.equals("a")) {
                System.out.println("LEFT");
            } else if (input.equals("s")) {
                System.out.println("DOWN");
            } else if (input.equals("d")) {
                System.out.println("RIGHT");
            } else if (input.equals("q")) {
                System.out.println("EXIT");
                break;
            } else {
                System.out.println("WARNING");
            }
        }
    }
}
