package exercise.Exercise2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner distances = new Scanner(System.in);
        System.out.println("Inches :");
        double amount = distances.nextDouble();
        double miles = amount / 63360;
        miles = (int) miles;
        amount = amount % 63360;
        double feet = amount / 12;
        feet = (int) feet;
        amount = amount % 12;
        double inches = amount;
        inches = (int) inches;
        System.out.print("\n" + "Miles : ");
        System.out.printf("%,.0f", miles);
        System.out.print("\n" + "Feet : ");
        System.out.printf("%,.0f", feet);
        System.out.print("\n" + "Inches : ");
        System.out.printf("%,.0f", inches);
        distances.close();
    }
}