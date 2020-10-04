package exercise.Exercise4;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner distances = new Scanner(System.in);
        System.out.print("Centimeters :");
        float cm = distances.nextFloat();
        double kilometers = cm / 100000;
        kilometers = (int) kilometers;
        cm = cm % 100000;
        double meters = cm / 100;
        meters = (int) meters;
        cm = cm % 100;
        double centimeters = cm;
        centimeters = (int) centimeters;
        System.out.print("\n" + "Kilometers : ");
        System.out.printf("%,.0f", kilometers);
        System.out.print("\n" + "Meters : ");
        System.out.printf("%,.0f", meters);
        System.out.print("\n" + "Centimeters : ");
        System.out.printf("%,.0f", centimeters);
        distances.close();
    }
}