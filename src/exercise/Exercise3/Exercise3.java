package exercise.Exercise3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner dimensions = new Scanner(System.in);
        System.out.print("Length : ");
        float length = dimensions.nextFloat();
        System.out.print("Width : ");
        float width = dimensions.nextFloat();
        System.out.print("Diameter : ");
        float diameter = dimensions.nextFloat();
        double radius = diameter * .5;
        double initialSurface = length * width;
        double cornholeArea = Math.PI * Math.pow(radius, 2);
        double finalSurface = initialSurface - cornholeArea;
        System.out.print("Surface Area : ");
        System.out.printf("%,.2f", finalSurface);
        dimensions.close();
    }
}