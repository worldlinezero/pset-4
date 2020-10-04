package exercise.Exercise9;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner initials = new Scanner(System.in);
        System.out.print("First name : ");
        String first = initials.nextLine();
        first = first.toUpperCase();
        first = first.substring(0, 1);
        System.out.print("Middle name : ");
        String middle = initials.nextLine();
        middle = middle.toUpperCase();
        middle = middle.substring(0, 1);
        System.out.print("Last name : ");
        String last = initials.nextLine();
        last = last.toUpperCase();
        last = last.substring(0, 1);
        String inits = first + middle + last;
        System.out.println("\n" + inits + ".");
        initials.close();
    }
}