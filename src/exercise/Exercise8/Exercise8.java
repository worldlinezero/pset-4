package exercise.Exercise8;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner capReverse = new Scanner(System.in);
        System.out.print("Text : ");
        String text = capReverse.nextLine();
        int length = text.length();
        int parer = length / 2;
        String firstHalf = text.substring(0, parer);
        String secondHalf = text.substring(parer);
        String afterReversal = (secondHalf + firstHalf);
        String finalString = afterReversal.toUpperCase();
        System.out.println("\n" + finalString + ".");
        capReverse.close();
    }
}