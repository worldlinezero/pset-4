package exercise.Exercise7;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner hexMetrics = new Scanner(System.in);
        System.out.print("Side : ");
        float side = hexMetrics.nextFloat();
        double area = (((3 * (Math.sqrt(3)))/2) * Math.pow (side, 2));
        double perimeter = (side * 6);
        System.out.print("\n" + "Area : ");
        System.out.printf("%,.2f", area);
        System.out.print("\n" + "Perimeter : ");
        System.out.printf("%,.2f", perimeter);
        hexMetrics.close();
    }
}