package exercise.Exercise5;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner circle = new Scanner(System.in);
        System.out.println("Diameter :");
        float diameter = circle.nextFloat();
        double area = Math.PI * Math.pow ((diameter / 2), 2);
        double circumference = 2 * Math.PI * (diameter / 2);
        System.out.print("\n" + "Area : ");
        System.out.printf("%,.2f", area);
        System.out.print("\n" + "Circumference : ");
        System.out.printf("%,.2f", circumference);
        circle.close();
    }
}